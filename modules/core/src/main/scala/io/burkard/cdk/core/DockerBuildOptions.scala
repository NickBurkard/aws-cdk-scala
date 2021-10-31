package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DockerBuildOptions {

  def apply(
    buildArgs: Option[Map[String, String]] = None,
    file: Option[String] = None,
    platform: Option[String] = None
  ): software.amazon.awscdk.DockerBuildOptions =
    (new software.amazon.awscdk.DockerBuildOptions.Builder)
      .buildArgs(buildArgs.map(_.asJava).orNull)
      .file(file.orNull)
      .platform(platform.orNull)
      .build()
}
