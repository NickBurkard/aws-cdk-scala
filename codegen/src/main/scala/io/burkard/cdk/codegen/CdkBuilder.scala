package io.burkard.cdk.codegen

import java.lang.reflect.{Method, Modifier}
import java.nio.file.{Path, Paths}

// Class instance builder provided by the CDK.
final case class CdkBuilder private(
  serviceName: String,
  instanceCanonicalName: String,
  instanceSimpleName: String,
  underlying: Class[_]
) {
  // [0, N] field methods of the underlying builder.
  private[this] lazy val fieldMethods: List[FieldMethod] =
    underlying
      .getMethods
      .toList
      .flatMap(FieldMethod.build)

  lazy val packageName: String = renamePackage(underlying.getPackageName)

  lazy val parameters: List[String] =
    fieldMethods.map(_.asParameter)

  lazy val builderMethods: List[String] =
    fieldMethods.map(_.asBuilderMethod)

  lazy val imports: String =
    if (fieldMethods.exists(_.requiresJavaConverters)) {
      "\nimport scala.jdk.CollectionConverters._\n"
    } else {
      ""
    }

  lazy val applyMethodSignature: String =
    if (fieldMethods.nonEmpty) {
      s"""def apply(
         |    id: String,
         |    ${parameters.mkString(",\n    ")}
         |  )(implicit stackCtx: software.amazon.awscdk.Stack): $instanceCanonicalName""".stripMargin
    } else {
      s"def apply(id: String)(implicit stackCtx: software.amazon.awscdk.Stack): $instanceCanonicalName"
    }
}

object CdkBuilder {

  implicit val sourceGenerator: SourceGenerator[CdkBuilder] =
    new SourceGenerator[CdkBuilder] {
      override def path(source: CdkBuilder): Path =
        Paths.get(
          s"aws-cdk-scala-${source.serviceName}",
          s"src/main/scala/${source.packageName.replace(".", "/")}/${source.instanceSimpleName}.scala".split("/"): _*
        )

      override def gen(source: CdkBuilder): String =
        s"""package ${source.packageName}
           |${source.imports}
           |object ${source.instanceSimpleName} {
           |
           |  ${source.applyMethodSignature} =
           |    ${source.instanceCanonicalName}.Builder
           |      .create(stackCtx, id)
           |      ${source.builderMethods.mkString("\n      ")}
           |      .build()
           |}
           |""".stripMargin
    }

  // Using Java reflection to identify which CDK classes we can codegen.
  // Not using Scala reflection because of 2.x/3.x API differences.
  def build(serviceName: String, underlying: Class[_]): Option[CdkBuilder] =
    if (underlying.getSimpleName == "Builder") {
      for {
        // Must have a static `create` method.
        _ <- createMethod(underlying)

        // Must have a `build` method.
        _ <- buildMethod(underlying)

        instanceCanonicalName = underlying.getCanonicalName.split("\\.").toList.dropRight(1).mkString(".")

        instanceSimpleName <- instanceCanonicalName.split("\\.").toList.lastOption
      } yield CdkBuilder(serviceName, instanceCanonicalName, instanceSimpleName, underlying)
    } else {
      None
    }

  // public static Builder create(context, id)
  private[this] def createMethod(underlying: Class[_]): Option[Method] =
    underlying.getMethods
      .find(m => m.getName == "create" && Modifier.isStatic(m.getModifiers) && m.getParameterCount == 2)

  // public Underlying build()
  private[this] def buildMethod(underlying: Class[_]): Option[Method] =
    underlying.getMethods
      .find(m => m.getName == "build" && !Modifier.isStatic(m.getModifiers) && m.getParameterCount == 0)
}
