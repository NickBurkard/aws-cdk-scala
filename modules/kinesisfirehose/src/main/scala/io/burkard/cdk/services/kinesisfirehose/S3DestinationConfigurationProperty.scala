package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3DestinationConfigurationProperty {

  def apply(
    bucketArn: String,
    roleArn: String,
    encryptionConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.EncryptionConfigurationProperty] = None,
    errorOutputPrefix: Option[String] = None,
    compressionFormat: Option[String] = None,
    prefix: Option[String] = None,
    cloudWatchLoggingOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty] = None,
    bufferingHints: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.BufferingHintsProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty.Builder)
      .bucketArn(bucketArn)
      .roleArn(roleArn)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .errorOutputPrefix(errorOutputPrefix.orNull)
      .compressionFormat(compressionFormat.orNull)
      .prefix(prefix.orNull)
      .cloudWatchLoggingOptions(cloudWatchLoggingOptions.orNull)
      .bufferingHints(bufferingHints.orNull)
      .build()
}
