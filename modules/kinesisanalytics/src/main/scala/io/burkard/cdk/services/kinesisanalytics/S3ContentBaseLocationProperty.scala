package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3ContentBaseLocationProperty {

  def apply(
    basePath: String,
    bucketArn: String
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.S3ContentBaseLocationProperty.Builder)
      .basePath(basePath)
      .bucketArn(bucketArn)
      .build()
}
