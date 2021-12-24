import scala.annotation.nowarn
import scala.collection.JavaConverters._

import sbt._

import com.google.common.reflect.ClassPath

import codegen._

object ServiceCodegen extends (File => Seq[File]) {
  override def apply(root: File): Seq[File] = {
    val files = awsClasses.flatMap(toFile(root))
    if (files.nonEmpty) {
      files
    } else {
      sys.error(s"Generated zero classes, something is seriously wrong! :)")
    }
  }

  private[this] def toFile(root: File)(underlying: Class[_]): Option[File] =
    CdkBuilder
      .build(underlying)
      .map(_.writeFile(root))
      .orElse(
        CdkEnum
          .build(underlying)
          .map(_.writeFile(root))
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
