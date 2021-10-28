package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileAssetMetadataEntry {

  def apply(
    packaging: Option[String] = None,
    s3KeyParameter: Option[String] = None,
    sourceHash: Option[String] = None,
    id: Option[String] = None,
    s3BucketParameter: Option[String] = None,
    path: Option[String] = None,
    artifactHashParameter: Option[String] = None
  ): software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry =
    (new software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry.Builder)
      .packaging(packaging.orNull)
      .s3KeyParameter(s3KeyParameter.orNull)
      .sourceHash(sourceHash.orNull)
      .id(id.orNull)
      .s3BucketParameter(s3BucketParameter.orNull)
      .path(path.orNull)
      .artifactHashParameter(artifactHashParameter.orNull)
      .build()
}
