package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FileAssetLocation {

  def apply(
    objectKey: Option[String] = None,
    bucketName: Option[String] = None,
    httpUrl: Option[String] = None,
    s3ObjectUrl: Option[String] = None
  ): software.amazon.awscdk.FileAssetLocation =
    (new software.amazon.awscdk.FileAssetLocation.Builder)
      .objectKey(objectKey.orNull)
      .bucketName(bucketName.orNull)
      .httpUrl(httpUrl.orNull)
      .s3ObjectUrl(s3ObjectUrl.orNull)
      .build()
}
