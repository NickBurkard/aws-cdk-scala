package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
