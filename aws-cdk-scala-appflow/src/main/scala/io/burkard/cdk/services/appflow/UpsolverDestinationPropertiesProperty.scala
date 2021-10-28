package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UpsolverDestinationPropertiesProperty {

  def apply(
    s3OutputFormatConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.UpsolverS3OutputFormatConfigProperty] = None,
    bucketPrefix: Option[String] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.UpsolverDestinationPropertiesProperty.Builder)
      .s3OutputFormatConfig(s3OutputFormatConfig.orNull)
      .bucketPrefix(bucketPrefix.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
