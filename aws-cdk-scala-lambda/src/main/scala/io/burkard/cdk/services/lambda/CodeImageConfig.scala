package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeImageConfig {

  def apply(
    imageUri: Option[String] = None,
    cmd: Option[List[String]] = None,
    entrypoint: Option[List[String]] = None,
    workingDirectory: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CodeImageConfig =
    (new software.amazon.awscdk.services.lambda.CodeImageConfig.Builder)
      .imageUri(imageUri.orNull)
      .cmd(cmd.map(_.asJava).orNull)
      .entrypoint(entrypoint.map(_.asJava).orNull)
      .workingDirectory(workingDirectory.orNull)
      .build()
}
