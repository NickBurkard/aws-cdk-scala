package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DockerRunOptions {

  def apply(
    securityOpt: Option[String] = None,
    command: Option[List[String]] = None,
    volumes: Option[List[_ <: software.amazon.awscdk.DockerVolume]] = None,
    entrypoint: Option[List[String]] = None,
    environment: Option[Map[String, String]] = None,
    workingDirectory: Option[String] = None,
    user: Option[String] = None
  ): software.amazon.awscdk.DockerRunOptions =
    (new software.amazon.awscdk.DockerRunOptions.Builder)
      .securityOpt(securityOpt.orNull)
      .command(command.map(_.asJava).orNull)
      .volumes(volumes.map(_.asJava).orNull)
      .entrypoint(entrypoint.map(_.asJava).orNull)
      .environment(environment.map(_.asJava).orNull)
      .workingDirectory(workingDirectory.orNull)
      .user(user.orNull)
      .build()
}
