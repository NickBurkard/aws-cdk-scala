package io.burkard.cdk.codegen

import scala.jdk.CollectionConverters._

import com.google.common.reflect.ClassPath

object Codegen {
  def main(args: Array[String]): Unit =
    codegen()

  private[this] def codegen(): Unit =
    ClassPath
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
      .map { case (name, classInfo) =>
        name -> classInfo
          .map(_._2)
          .flatMap { underlying =>
            CdkBuilder
              .build(name, underlying)
              .map(_.sourceFile)
              .orElse(
                CdkEnum
                  .build(name, underlying)
                  .map(_.sourceFile)
              )
          }
      }
      .toList
      .sortBy(_._1)
      .foreach { case (name, sourceFiles) =>
        println(name)
        sourceFiles.foreach { sourceFile =>
          println(sourceFile.path)
          sourceFile.writeToSource()
        }
      }
}
