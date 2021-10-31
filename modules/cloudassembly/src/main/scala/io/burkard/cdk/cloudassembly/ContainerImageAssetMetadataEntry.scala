package io.burkard.cdk.cloudassembly

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ContainerImageAssetMetadataEntry {

  def apply(
    packaging: Option[String] = None,
    path: Option[String] = None,
    imageTag: Option[String] = None,
    sourceHash: Option[String] = None,
    id: Option[String] = None,
    repositoryName: Option[String] = None,
    buildArgs: Option[Map[String, String]] = None,
    file: Option[String] = None,
    target: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry =
    (new software.amazon.awscdk.cloudassembly.schema.ContainerImageAssetMetadataEntry.Builder)
      .packaging(packaging.orNull)
      .path(path.orNull)
      .imageTag(imageTag.orNull)
      .sourceHash(sourceHash.orNull)
      .id(id.orNull)
      .repositoryName(repositoryName.orNull)
      .buildArgs(buildArgs.map(_.asJava).orNull)
      .file(file.orNull)
      .target(target.orNull)
      .build()
}
