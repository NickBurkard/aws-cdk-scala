package io.burkard.cdk.core

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileAssetLocation {

  def apply(
    objectKey: String,
    bucketName: String,
    httpUrl: String,
    s3ObjectUrl: String,
    s3Url: Option[String] = None,
    kmsKeyArn: Option[String] = None
  ): software.amazon.awscdk.FileAssetLocation =
    (new software.amazon.awscdk.FileAssetLocation.Builder)
      .objectKey(objectKey)
      .bucketName(bucketName)
      .httpUrl(httpUrl)
      .s3ObjectUrl(s3ObjectUrl)
      .s3Url(s3Url.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .build()
}
