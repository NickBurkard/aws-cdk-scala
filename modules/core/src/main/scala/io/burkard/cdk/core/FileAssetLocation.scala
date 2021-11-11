package io.burkard.cdk.core

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FileAssetLocation {

  def apply(
    objectKey: Option[String] = None,
    s3Url: Option[String] = None,
    kmsKeyArn: Option[String] = None,
    bucketName: Option[String] = None,
    httpUrl: Option[String] = None,
    s3ObjectUrl: Option[String] = None
  ): software.amazon.awscdk.FileAssetLocation =
    (new software.amazon.awscdk.FileAssetLocation.Builder)
      .objectKey(objectKey.orNull)
      .s3Url(s3Url.orNull)
      .kmsKeyArn(kmsKeyArn.orNull)
      .bucketName(bucketName.orNull)
      .httpUrl(httpUrl.orNull)
      .s3ObjectUrl(s3ObjectUrl.orNull)
      .build()
}
