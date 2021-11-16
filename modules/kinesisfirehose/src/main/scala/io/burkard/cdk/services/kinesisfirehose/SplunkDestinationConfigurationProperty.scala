package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SplunkDestinationConfigurationProperty {

  def apply(
    hecEndpoint: String,
    hecToken: String,
    s3Configuration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty,
    hecEndpointType: String,
    hecAcknowledgmentTimeoutInSeconds: Option[Number] = None,
    cloudWatchLoggingOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty] = None,
    retryOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty] = None,
    processingConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty] = None,
    s3BackupMode: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder)
      .hecEndpoint(hecEndpoint)
      .hecToken(hecToken)
      .s3Configuration(s3Configuration)
      .hecEndpointType(hecEndpointType)
      .hecAcknowledgmentTimeoutInSeconds(hecAcknowledgmentTimeoutInSeconds.orNull)
      .cloudWatchLoggingOptions(cloudWatchLoggingOptions.orNull)
      .retryOptions(retryOptions.orNull)
      .processingConfiguration(processingConfiguration.orNull)
      .s3BackupMode(s3BackupMode.orNull)
      .build()
}
