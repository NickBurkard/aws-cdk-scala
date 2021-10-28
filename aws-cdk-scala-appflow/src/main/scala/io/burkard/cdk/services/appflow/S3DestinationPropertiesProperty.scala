package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3DestinationPropertiesProperty {

  def apply(
    s3OutputFormatConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.S3OutputFormatConfigProperty] = None,
    bucketPrefix: Option[String] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.S3DestinationPropertiesProperty.Builder)
      .s3OutputFormatConfig(s3OutputFormatConfig.orNull)
      .bucketPrefix(bucketPrefix.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
