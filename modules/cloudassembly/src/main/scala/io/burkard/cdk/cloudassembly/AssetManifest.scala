package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetManifest {

  def apply(
    files: Option[Map[String, _ <: software.amazon.awscdk.cloudassembly.schema.FileAsset]] = None,
    version: Option[String] = None,
    dockerImages: Option[Map[String, _ <: software.amazon.awscdk.cloudassembly.schema.DockerImageAsset]] = None
  ): software.amazon.awscdk.cloudassembly.schema.AssetManifest =
    (new software.amazon.awscdk.cloudassembly.schema.AssetManifest.Builder)
      .files(files.map(_.asJava).orNull)
      .version(version.orNull)
      .dockerImages(dockerImages.map(_.asJava).orNull)
      .build()
}
