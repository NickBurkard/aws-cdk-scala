import scala.annotation.nowarn
import scala.collection.JavaConverters._

import sbt._

import com.google.common.reflect.ClassPath

import codegen._

object ServiceCodegen extends ((String, File) => Seq[File]) {
  override def apply(moduleName: String, root: File): Seq[File] = {
    val classes = awsClasses
    val unsupported = classes
      .collect {
        case (name, _) if !(KnownAwsServiceNames.contains(name) || IgnoredAwsServiceNames.contains(name)) =>
          name
      }
      .toSet

    if (unsupported.nonEmpty) {
      sys.error(s"""Unknown AWS service(s) found, consider adding as module(s): ${unsupported.mkString(", ")}""")
    }

    val files = classes.toList.flatMap { case (name, classes) =>
      if (KnownAwsServiceNames.contains(name) && name == moduleName) {
        classes.flatMap(c => toFile(moduleName, root, c.load()))
      } else {
        Nil
      }
    }

    // There must be at least one file generated for the service.
    if (files.nonEmpty) {
      files
    } else {
      sys.error(s"Known AWS service $moduleName has zero classes, consider removing as a module")
    }
  }

  private[this] def toFile(serviceName: String, root: File, underlying: Class[_]): Option[File] =
    CdkBuilder
      .build(serviceName, underlying)
      .map(_.writeFile(root))
      .orElse(
        CdkEnum
          .build(serviceName, underlying)
          .map(_.writeFile(root))
      )

  @nowarn("cat=deprecation")
  private[this] def awsClasses: Map[String, List[ClassPath.ClassInfo]] =
    ClassPath
      .from(getClass.getClassLoader)
      .getAllClasses
      .asScala
      .toList
      .flatMap { classInfo =>
        classInfo.getPackageName match {
          // Resource for some service.
          case ServiceRegex(_, name) =>
            if (CoreOverrides.contains(name)) {
              Some("core" -> classInfo)
            } else {
              Some(name -> classInfo)
            }

          // Shared resources are considered `core`.
          case CoreRegex() =>
            Some("core" -> classInfo)

          case _ =>
            None
        }
      }
      .groupBy(_._1)
      .map { case (name, classes) => name -> classes.map(_._2) }
}
