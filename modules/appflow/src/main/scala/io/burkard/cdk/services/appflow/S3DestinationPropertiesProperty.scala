package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3DestinationPropertiesProperty {

  def apply(
    bucketName: String,
    s3OutputFormatConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty] = None,
    bucketPrefix: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty.Builder)
      .bucketName(bucketName)
      .s3OutputFormatConfig(s3OutputFormatConfig.orNull)
      .bucketPrefix(bucketPrefix.orNull)
      .build()
}
