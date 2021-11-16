package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExtendedS3DestinationConfigurationProperty {

  def apply(
    roleArn: String,
    bucketArn: String,
    errorOutputPrefix: Option[String] = None,
    dynamicPartitioningConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DynamicPartitioningConfigurationProperty] = None,
    compressionFormat: Option[String] = None,
    processingConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty] = None,
    s3BackupMode: Option[String] = None,
    encryptionConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty] = None,
    s3BackupConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty] = None,
    prefix: Option[String] = None,
    cloudWatchLoggingOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty] = None,
    bufferingHints: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty] = None,
    dataFormatConversionConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DataFormatConversionConfigurationProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty.Builder)
      .roleArn(roleArn)
      .bucketArn(bucketArn)
      .errorOutputPrefix(errorOutputPrefix.orNull)
      .dynamicPartitioningConfiguration(dynamicPartitioningConfiguration.orNull)
      .compressionFormat(compressionFormat.orNull)
      .processingConfiguration(processingConfiguration.orNull)
      .s3BackupMode(s3BackupMode.orNull)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .s3BackupConfiguration(s3BackupConfiguration.orNull)
      .prefix(prefix.orNull)
      .cloudWatchLoggingOptions(cloudWatchLoggingOptions.orNull)
      .bufferingHints(bufferingHints.orNull)
      .dataFormatConversionConfiguration(dataFormatConversionConfiguration.orNull)
      .build()
}
