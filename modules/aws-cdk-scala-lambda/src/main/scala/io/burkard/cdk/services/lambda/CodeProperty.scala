package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CodeProperty {

  def apply(
    s3Bucket: Option[String] = None,
    imageUri: Option[String] = None,
    zipFile: Option[String] = None,
    s3Key: Option[String] = None,
    s3ObjectVersion: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty =
    (new software.amazon.awscdk.services.lambda.CfnFunction.CodeProperty.Builder)
      .s3Bucket(s3Bucket.orNull)
      .imageUri(imageUri.orNull)
      .zipFile(zipFile.orNull)
      .s3Key(s3Key.orNull)
      .s3ObjectVersion(s3ObjectVersion.orNull)
      .build()
}
