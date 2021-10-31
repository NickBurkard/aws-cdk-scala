package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedshiftDestinationConfigurationProperty {

  def apply(
    s3BackupConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty] = None,
    username: Option[String] = None,
    cloudWatchLoggingOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty] = None,
    s3Configuration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty] = None,
    retryOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty] = None,
    copyCommand: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty] = None,
    processingConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty] = None,
    s3BackupMode: Option[String] = None,
    password: Option[String] = None,
    roleArn: Option[String] = None,
    clusterJdbcurl: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder)
      .s3BackupConfiguration(s3BackupConfiguration.orNull)
      .username(username.orNull)
      .cloudWatchLoggingOptions(cloudWatchLoggingOptions.orNull)
      .s3Configuration(s3Configuration.orNull)
      .retryOptions(retryOptions.orNull)
      .copyCommand(copyCommand.orNull)
      .processingConfiguration(processingConfiguration.orNull)
      .s3BackupMode(s3BackupMode.orNull)
      .password(password.orNull)
      .roleArn(roleArn.orNull)
      .clusterJdbcurl(clusterJdbcurl.orNull)
      .build()
}
