package io.burkard.cdk.cloudassembly

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
