package io.burkard.cdk.services.lambda

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DockerBuildAssetOptions {

  def apply(
    buildArgs: Option[Map[String, String]] = None,
    imagePath: Option[String] = None,
    outputPath: Option[String] = None,
    file: Option[String] = None,
    platform: Option[String] = None
  ): software.amazon.awscdk.services.lambda.DockerBuildAssetOptions =
    (new software.amazon.awscdk.services.lambda.DockerBuildAssetOptions.Builder)
      .buildArgs(buildArgs.map(_.asJava).orNull)
      .imagePath(imagePath.orNull)
      .outputPath(outputPath.orNull)
      .file(file.orNull)
      .platform(platform.orNull)
      .build()
}
