import scala.annotation.nowarn
import scala.collection.JavaConverters._

import com.google.common.reflect.ClassPath

import codegen._

import sbt._

object ServiceCodegen extends ((String, File) => Seq[File]) {
  override def apply(moduleName: String, root: File): Seq[sbt.File] =
    codegen(moduleName, root)

  // Generate code for a specific AWS CDK service.
  private[this] def codegen(serviceName: String, root: File): Seq[File] =
    classesForService(serviceName).flatMap { underlying =>
      CdkBuilder
        .build(serviceName, underlying)
        .map(_.writeFile(root))
        .orElse(
          CdkEnum
            .build(serviceName, underlying)
            .map(_.writeFile(root))
        )
    }

  @nowarn("cat=deprecation")
  private[this] def classesForService(serviceName: String): List[Class[_]] =
    ClassPath
      .from(getClass.getClassLoader)
      .getAllClasses
      .asScala
      .toList
      // Collect classes for the specified service.
      // Can't do `collect`, matching on a String doesn't seem to provide a partial function.
      .flatMap { classInfo =>
        val packageName = classInfo.getPackageName match {
          // Resource for some service.
          case ServiceRegex(_, name) =>
            if (CoreOverrides.contains(name)) {
              Some("core")
            } else {
              Some(name)
            }

          // Shared resources are considered `core`.
          case CoreRegex() =>
            Some("core")

          case _ =>
            None
        }

        packageName.collect { case name if name == serviceName => classInfo.load() }
      }
}
