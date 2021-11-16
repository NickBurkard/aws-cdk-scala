package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpEndpointDestinationConfigurationProperty {

  def apply(
    s3Configuration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty,
    endpointConfiguration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointConfigurationProperty,
    cloudWatchLoggingOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty] = None,
    retryOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RetryOptionsProperty] = None,
    requestConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointRequestConfigurationProperty] = None,
    processingConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty] = None,
    s3BackupMode: Option[String] = None,
    roleArn: Option[String] = None,
    bufferingHints: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty.Builder)
      .s3Configuration(s3Configuration)
      .endpointConfiguration(endpointConfiguration)
      .cloudWatchLoggingOptions(cloudWatchLoggingOptions.orNull)
      .retryOptions(retryOptions.orNull)
      .requestConfiguration(requestConfiguration.orNull)
      .processingConfiguration(processingConfiguration.orNull)
      .s3BackupMode(s3BackupMode.orNull)
      .roleArn(roleArn.orNull)
      .bufferingHints(bufferingHints.orNull)
      .build()
}
