package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SplunkDestinationConfigurationProperty {

  def apply(
    hecEndpoint: Option[String] = None,
    hecAcknowledgmentTimeoutInSeconds: Option[Number] = None,
    cloudWatchLoggingOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty] = None,
    hecToken: Option[String] = None,
    s3Configuration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty] = None,
    retryOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkRetryOptionsProperty] = None,
    processingConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty] = None,
    hecEndpointType: Option[String] = None,
    s3BackupMode: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty.Builder)
      .hecEndpoint(hecEndpoint.orNull)
      .hecAcknowledgmentTimeoutInSeconds(hecAcknowledgmentTimeoutInSeconds.orNull)
      .cloudWatchLoggingOptions(cloudWatchLoggingOptions.orNull)
      .hecToken(hecToken.orNull)
      .s3Configuration(s3Configuration.orNull)
      .retryOptions(retryOptions.orNull)
      .processingConfiguration(processingConfiguration.orNull)
      .hecEndpointType(hecEndpointType.orNull)
      .s3BackupMode(s3BackupMode.orNull)
      .build()
}
