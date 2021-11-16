package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SnowflakeDestinationPropertiesProperty {

  def apply(
    intermediateBucketName: String,
    `object`: String,
    bucketPrefix: Option[String] = None,
    errorHandlingConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SnowflakeDestinationPropertiesProperty.Builder)
      .intermediateBucketName(intermediateBucketName)
      .`object`(`object`)
      .bucketPrefix(bucketPrefix.orNull)
      .errorHandlingConfig(errorHandlingConfig.orNull)
      .build()
}
