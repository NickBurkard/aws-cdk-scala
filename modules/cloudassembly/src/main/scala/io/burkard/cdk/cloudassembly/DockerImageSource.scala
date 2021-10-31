package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DockerImageSource {

  def apply(
    dockerFile: Option[String] = None,
    dockerBuildArgs: Option[Map[String, String]] = None,
    dockerBuildTarget: Option[String] = None,
    executable: Option[List[String]] = None,
    directory: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.DockerImageSource =
    (new software.amazon.awscdk.cloudassembly.schema.DockerImageSource.Builder)
      .dockerFile(dockerFile.orNull)
      .dockerBuildArgs(dockerBuildArgs.map(_.asJava).orNull)
      .dockerBuildTarget(dockerBuildTarget.orNull)
      .executable(executable.map(_.asJava).orNull)
      .directory(directory.orNull)
      .build()
}
