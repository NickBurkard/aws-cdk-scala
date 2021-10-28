package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object S3DestinationConfigurationProperty {

  def apply(
    encryptionConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty] = None,
    errorOutputPrefix: Option[String] = None,
    compressionFormat: Option[String] = None,
    bucketArn: Option[String] = None,
    prefix: Option[String] = None,
    cloudWatchLoggingOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty] = None,
    roleArn: Option[String] = None,
    bufferingHints: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .errorOutputPrefix(errorOutputPrefix.orNull)
      .compressionFormat(compressionFormat.orNull)
      .bucketArn(bucketArn.orNull)
      .prefix(prefix.orNull)
      .cloudWatchLoggingOptions(cloudWatchLoggingOptions.orNull)
      .roleArn(roleArn.orNull)
      .bufferingHints(bufferingHints.orNull)
      .build()
}
