package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ImageConfigProperty {

  def apply(
    entryPoint: Option[List[String]] = None,
    command: Option[List[String]] = None,
    workingDirectory: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty =
    (new software.amazon.awscdk.services.lambda.CfnFunction.ImageConfigProperty.Builder)
      .entryPoint(entryPoint.map(_.asJava).orNull)
      .command(command.map(_.asJava).orNull)
      .workingDirectory(workingDirectory.orNull)
      .build()
}
