package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileAssetLocation {

  def apply(
    objectKey: String,
    bucketName: String,
    httpUrl: String,
    s3ObjectUrl: String
  ): software.amazon.awscdk.FileAssetLocation =
    (new software.amazon.awscdk.FileAssetLocation.Builder)
      .objectKey(objectKey)
      .bucketName(bucketName)
      .httpUrl(httpUrl)
      .s3ObjectUrl(s3ObjectUrl)
      .build()
}
