package io.burkard.cdk.codegen

import java.lang.reflect.{Method, Modifier}
import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

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

  private[this] lazy val packageName: String = renamePackage(underlying.getPackageName)

  private[this] lazy val parameters: List[String] =
    fieldMethods.map(_.asParameter)

  private[this] lazy val builderMethods: List[String] =
    fieldMethods.map(_.asBuilderMethod)

  private[this] lazy val imports: String =
    if (fieldMethods.exists(_.requiresJavaConverters)) {
      "\nimport scala.jdk.CollectionConverters._\n"
    } else {
      ""
    }

  def codegen: String =
    s"""package $packageName
      |$imports
      |object $instanceSimpleName {
      |
      |  $applyMethodSignature =
      |    $instanceCanonicalName.Builder
      |      .create(stackCtx, id)
      |      ${builderMethods.mkString("\n      ")}
      |      .build()
      |}
      |""".stripMargin

  private[this] def applyMethodSignature: String =
    if (fieldMethods.nonEmpty) {
      s"""def apply(
         |    id: String,
         |    ${parameters.mkString(",\n    ")}
         |  )(implicit stackCtx: software.amazon.awscdk.Stack): $instanceCanonicalName""".stripMargin
    } else {
      s"def apply(id: String)(implicit stackCtx: software.amazon.awscdk.Stack): $instanceCanonicalName"
    }

  private[this] lazy val path =
    Paths.get(
      s"aws-cdk-scala-$serviceName",
      s"src/main/scala/${packageName.replace(".", "/")}/$instanceSimpleName.scala".split("/"): _*
    )

  def writeToSource(): Unit = {
    if (!Files.exists(path)) {
      Files.createDirectories(path.getParent)
      Files.createFile(path)
    }

    val _ = Files.write(path, codegen.getBytes(StandardCharsets.UTF_8))
  }
}

object CdkBuilder {
  // Using Java reflection to identify which CDK classes we can codegen.
  // Not using Scala reflection because of 2.x/3.x API differences.
  def build(serviceName: String)(underlying: Class[_]): Option[CdkBuilder] =
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
