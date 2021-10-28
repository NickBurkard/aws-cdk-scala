package io.burkard.cdk.core

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DockerImageAssetSource {

  def apply(
    dockerFile: Option[String] = None,
    dockerBuildArgs: Option[Map[String, String]] = None,
    sourceHash: Option[String] = None,
    dockerBuildTarget: Option[String] = None,
    directoryName: Option[String] = None,
    executable: Option[List[String]] = None
  ): software.amazon.awscdk.DockerImageAssetSource =
    (new software.amazon.awscdk.DockerImageAssetSource.Builder)
      .dockerFile(dockerFile.orNull)
      .dockerBuildArgs(dockerBuildArgs.map(_.asJava).orNull)
      .sourceHash(sourceHash.orNull)
      .dockerBuildTarget(dockerBuildTarget.orNull)
      .directoryName(directoryName.orNull)
      .executable(executable.map(_.asJava).orNull)
      .build()
}
