package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ContentLocationProperty {

  def apply(
    fileKey: Option[String] = None,
    bucketArn: Option[String] = None,
    objectVersion: Option[String] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentLocationProperty.Builder)
      .fileKey(fileKey.orNull)
      .bucketArn(bucketArn.orNull)
      .objectVersion(objectVersion.orNull)
      .build()
}
