import scala.annotation.nowarn
import scala.collection.JavaConverters._

import sbt._

import com.google.common.reflect.ClassPath

import codegen._

object ServiceCodegen extends (File => Seq[File]) {
  override def apply(root: File): Seq[File] = {
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

  private[this] def toFile(root: File, underlying: Class[_]): Option[CdkFile] =
    CdkBuilder
      .build(underlying)
      .map(_.toCdkFile(root))
      .orElse(
        CdkEnum
          .build(underlying)
          .map(_.toCdkFile(root))
      )

  @nowarn("cat=deprecation")
  private[this] def awsClasses: List[Class[_]] =
    ClassPath
      .from(getClass.getClassLoader)
      .getAllClasses
      .asScala
      .toList
      .collect { case classInfo if classInfo.getPackageName.startsWith("software.amazon.awscdk") =>
        classInfo.load()
      }
}
