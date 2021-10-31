package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
