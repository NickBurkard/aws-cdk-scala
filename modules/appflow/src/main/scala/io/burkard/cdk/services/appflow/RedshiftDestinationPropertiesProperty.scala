package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RedshiftDestinationPropertiesProperty {

  def apply(
    intermediateBucketName: Option[String] = None,
    `object`: Option[String] = None,
    bucketPrefix: Option[String] = None,
    errorHandlingConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.ErrorHandlingConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.RedshiftDestinationPropertiesProperty.Builder)
      .intermediateBucketName(intermediateBucketName.orNull)
      .`object`(`object`.orNull)
      .bucketPrefix(bucketPrefix.orNull)
      .errorHandlingConfig(errorHandlingConfig.orNull)
      .build()
}
