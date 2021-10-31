package io.burkard.cdk.codegen

import java.nio.file.{Files, Path}

import scala.jdk.CollectionConverters._

import com.google.common.reflect.ClassPath

object Codegen {
  def main(args: Array[String]): Unit =
    codegen()

  // Generate code for all AWS CDK services.
  private[this] def codegen(): Unit = {
    val filesPerService = ClassPath
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
      // Generate code for builders & enums.
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

    val toGenerate = filesPerService.flatMap(_._2.map(_.path)).toSet
    val toDelete = filesToDelete(toGenerate)
    println(s"Deleting ${toDelete.size} files")
    toDelete.foreach(Files.delete)

    // Generate code alphabetically per service.
    println(s"Generating ${toGenerate.size} files")
    filesPerService
      .sortBy(_._1)
      .foreach { case (name, sourceFiles) =>
        println(name)
        sourceFiles.foreach { sourceFile =>
          println(sourceFile.path)
          sourceFile.writeToSource()
        }
      }
  }

  // Files from previous CDK versions that are no longer needed.
  private[this] def filesToDelete(generatedFiles: Set[Path]): Set[Path] =
    localScalaFiles.diff(generatedFiles)

  // Files we never want to delete.
  private[this] val reservedFiles: Set[Path] =
    Set(
      Path.of("modules", "core/src/main/scala/io/burkard/cdk/package.scala".split('/'): _*),
      Path.of("modules", "core/src/main/scala/io/burkard/cdk/App.scala".split('/'): _*),
      Path.of("modules", "core/src/main/scala/io/burkard/cdk/Stack.scala".split('/'): _*)
    )

  // Local Scala files in this project, besides reserved files.
  private[this] val localScalaFiles: Set[Path] =
    Files
      .walk(Path.of("modules"))
      .toList
      .asScala
      .toSet
      .filter(_.toString.endsWith(".scala"))
      .diff(reservedFiles)
}
