package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpEndpointDestinationConfigurationProperty {

  def apply(
    cloudWatchLoggingOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty] = None,
    s3Configuration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty] = None,
    retryOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty] = None,
    requestConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty] = None,
    endpointConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty] = None,
    processingConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty] = None,
    s3BackupMode: Option[String] = None,
    roleArn: Option[String] = None,
    bufferingHints: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder)
      .cloudWatchLoggingOptions(cloudWatchLoggingOptions.orNull)
      .s3Configuration(s3Configuration.orNull)
      .retryOptions(retryOptions.orNull)
      .requestConfiguration(requestConfiguration.orNull)
      .endpointConfiguration(endpointConfiguration.orNull)
      .processingConfiguration(processingConfiguration.orNull)
      .s3BackupMode(s3BackupMode.orNull)
      .roleArn(roleArn.orNull)
      .bufferingHints(bufferingHints.orNull)
      .build()
}
