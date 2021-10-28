package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SnowflakeDestinationPropertiesProperty {

  def apply(
    intermediateBucketName: Option[String] = None,
    `object`: Option[String] = None,
    bucketPrefix: Option[String] = None,
    errorHandlingConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty.Builder)
      .intermediateBucketName(intermediateBucketName.orNull)
      .`object`(`object`.orNull)
      .bucketPrefix(bucketPrefix.orNull)
      .errorHandlingConfig(errorHandlingConfig.orNull)
      .build()
}
