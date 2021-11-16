package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AssetManifest {

  def apply(
    version: String,
    files: Option[Map[String, _ <: software.amazon.awscdk.cloudassembly.schema.FileAsset]] = None,
    dockerImages: Option[Map[String, _ <: software.amazon.awscdk.cloudassembly.schema.DockerImageAsset]] = None
  ): software.amazon.awscdk.cloudassembly.schema.AssetManifest =
    (new software.amazon.awscdk.cloudassembly.schema.AssetManifest.Builder)
      .version(version)
      .files(files.map(_.asJava).orNull)
      .dockerImages(dockerImages.map(_.asJava).orNull)
      .build()
}
