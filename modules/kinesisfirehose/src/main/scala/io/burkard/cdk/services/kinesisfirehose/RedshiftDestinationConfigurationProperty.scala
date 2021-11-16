package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RedshiftDestinationConfigurationProperty {

  def apply(
    username: String,
    s3Configuration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty,
    copyCommand: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CopyCommandProperty,
    password: String,
    roleArn: String,
    clusterJdbcurl: String,
    s3BackupConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty] = None,
    cloudWatchLoggingOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty] = None,
    retryOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftRetryOptionsProperty] = None,
    processingConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty] = None,
    s3BackupMode: Option[String] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty.Builder)
      .username(username)
      .s3Configuration(s3Configuration)
      .copyCommand(copyCommand)
      .password(password)
      .roleArn(roleArn)
      .clusterJdbcurl(clusterJdbcurl)
      .s3BackupConfiguration(s3BackupConfiguration.orNull)
      .cloudWatchLoggingOptions(cloudWatchLoggingOptions.orNull)
      .retryOptions(retryOptions.orNull)
      .processingConfiguration(processingConfiguration.orNull)
      .s3BackupMode(s3BackupMode.orNull)
      .build()
}
