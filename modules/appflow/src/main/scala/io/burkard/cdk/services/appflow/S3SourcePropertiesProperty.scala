package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3SourcePropertiesProperty {

  def apply(
    bucketPrefix: Option[String] = None,
    s3InputFormatConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.S3InputFormatConfigProperty] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.S3SourcePropertiesProperty.Builder)
      .bucketPrefix(bucketPrefix.orNull)
      .s3InputFormatConfig(s3InputFormatConfig.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
