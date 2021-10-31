package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BundlingOptions {

  def apply(
    image: Option[software.amazon.awscdk.DockerImage] = None,
    local: Option[software.amazon.awscdk.ILocalBundling] = None,
    securityOpt: Option[String] = None,
    command: Option[List[String]] = None,
    entrypoint: Option[List[String]] = None,
    environment: Option[Map[String, String]] = None,
    workingDirectory: Option[String] = None,
    user: Option[String] = None,
    volumes: Option[List[_ <: software.amazon.awscdk.DockerVolume]] = None,
    outputType: Option[software.amazon.awscdk.BundlingOutput] = None
  ): software.amazon.awscdk.BundlingOptions =
    (new software.amazon.awscdk.BundlingOptions.Builder)
      .image(image.orNull)
      .local(local.orNull)
      .securityOpt(securityOpt.orNull)
      .command(command.map(_.asJava).orNull)
      .entrypoint(entrypoint.map(_.asJava).orNull)
      .environment(environment.map(_.asJava).orNull)
      .workingDirectory(workingDirectory.orNull)
      .user(user.orNull)
      .volumes(volumes.map(_.asJava).orNull)
      .outputType(outputType.orNull)
      .build()
}
