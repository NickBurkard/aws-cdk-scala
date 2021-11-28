package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContainerImageAssetMetadataEntry {

  def apply(
    packaging: String,
    path: String,
    sourceHash: String,
    id: String,
    imageTag: Option[String] = None,
    repositoryName: Option[String] = None,
    buildArgs: Option[Map[String, String]] = None,
    file: Option[String] = None,
    target: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry =
    (new software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry.Builder)
      .packaging(packaging)
      .path(path)
      .sourceHash(sourceHash)
      .id(id)
      .imageTag(imageTag.orNull)
      .repositoryName(repositoryName.orNull)
      .buildArgs(buildArgs.map(_.asJava).orNull)
      .file(file.orNull)
      .target(target.orNull)
      .build()
}
