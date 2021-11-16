package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3SourcePropertiesProperty {

  def apply(
    bucketPrefix: String,
    bucketName: String,
    s3InputFormatConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty.Builder)
      .bucketPrefix(bucketPrefix)
      .bucketName(bucketName)
      .s3InputFormatConfig(s3InputFormatConfig.orNull)
      .build()
}
