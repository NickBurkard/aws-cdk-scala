package io.burkard.cdk.codegen

import scala.jdk.CollectionConverters._

import com.google.common.reflect.ClassPath

object Codegen {
  def main(args: Array[String]): Unit =
    codegen()

  private[this] def codegen(): Unit = {
    val classes = ClassPath
      .from(ClassLoader.getSystemClassLoader)
      .getAllClasses
      .asScala
      .toList
      // Collect classes per AWS service.
      .collect { classInfo =>
        classInfo.getPackageName match {
          // Resource for some service.
          case ServiceRegex(_, name) =>
            name -> classInfo.load()

          // Shared resources are considered `core`.
          case CoreRegex() =>
            "core" -> classInfo.load()
        }
      }
      .groupBy(_._1)
      .map { case (name, classInfo) => name -> classInfo.map(_._2) }

    // Load each service's classes, identifying builders.
    val regularSourceFiles = classes
      .map { case (name, classInfo) =>
        name -> classInfo.flatMap { underlying =>
          CdkBuilder
            .build(name, underlying)
            .map(_.sourceFile)
        }
      }
      .flatMap(_._2)

    // Package objects with type aliases.
    val packageObjectFiles = classes
      .flatMap { case (name, classInfo) =>
        classInfo.flatMap(CdkType.build(name))
      }
      .groupBy(t => (t.serviceName, t.packageName, t.finalPackageName))
      .map { case ((service, full, last), cdkTypes) =>
        CdkPackageObject(
          service,
          full,
          last,
          cdkTypes.toList
        ).sourceFile
      }
      .toList

    regularSourceFiles
      .concat(packageObjectFiles)
      .foreach { sourceFile =>
        println(sourceFile.path)
        sourceFile.writeToSource()
      }
  }
}
