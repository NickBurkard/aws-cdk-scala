package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
