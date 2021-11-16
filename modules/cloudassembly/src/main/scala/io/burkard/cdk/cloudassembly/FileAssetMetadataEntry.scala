package io.burkard.cdk.cloudassembly

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileAssetMetadataEntry {

  def apply(
    packaging: String,
    s3KeyParameter: String,
    sourceHash: String,
    id: String,
    s3BucketParameter: String,
    path: String,
    artifactHashParameter: String
  ): software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry =
    (new software.amazon.awscdk.cloudassembly.schema.FileAssetMetadataEntry.Builder)
      .packaging(packaging)
      .s3KeyParameter(s3KeyParameter)
      .sourceHash(sourceHash)
      .id(id)
      .s3BucketParameter(s3BucketParameter)
      .path(path)
      .artifactHashParameter(artifactHashParameter)
      .build()
}
