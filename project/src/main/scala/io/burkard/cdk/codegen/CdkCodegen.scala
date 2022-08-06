package io.burkard.cdk.codegen

import scala.annotation.nowarn
import scala.collection.JavaConverters._

import sbt._
import sbt.Keys._

import com.google.common.reflect.ClassPath

object CdkCodegen {
  private val cdkCodegen = taskKey[Seq[File]]("generate AWS CDK source files")

  def settings(config: Configuration): Seq[Setting[_]] = Seq(
    config / cdkCodegen := codegen((config / sourceManaged).value),
    config / sourceGenerators += (Compile / cdkCodegen),
    config / packageSrc / mappings ++= {
      val base = (config / sourceManaged).value
      (config / managedSources).value
        .flatMap(file => file.relativeTo(base).map(file -> _.getPath))
    }
  )

  private def codegen(root: File): Seq[File] = {
    val files = awsClasses.flatMap(c => toFile(root, c).map(_ -> c))

    val collisions = files
      .groupBy(_._1.path)
      .collect { case (path, duplicates) if duplicates.length > 1 =>
        path -> duplicates.map(_._2)
      }
      .toList

    if (collisions.nonEmpty) {
      collisions.foreach { case (name, classes) =>
        System.err.println(s"""$name: ${classes.map(_.getCanonicalName).mkString(" ")}""")
      }
      sys.error(s"Found ${collisions.length} colliding generated files")
    }

    if (files.nonEmpty) {
      files.map(_._1.write())
    } else {
      sys.error(s"Generated zero classes, something is seriously wrong! :)")
    }
  }

  private def toFile(root: File, underlying: Class[_]): Option[CdkFile] =
    CdkBuilder
      .build(underlying)
      .map(_.toCdkFile(root))
      .orElse(
        CdkEnum
          .build(underlying)
          .map(_.toCdkFile(root))
      )

  @nowarn("cat=deprecation")
  private def awsClasses: List[Class[_]] =
    ClassPath
      .from(getClass.getClassLoader)
      .getAllClasses
      .asScala
      .toList
      .collect { case classInfo if classInfo.getPackageName.startsWith("software.amazon.awscdk") =>
        classInfo.load()
      }
}
