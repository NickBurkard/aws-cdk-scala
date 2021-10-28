package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AmazonopensearchserviceDestinationConfigurationProperty {

  def apply(
    cloudWatchLoggingOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty] = None,
    s3Configuration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty] = None,
    retryOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty] = None,
    clusterEndpoint: Option[String] = None,
    indexName: Option[String] = None,
    processingConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty] = None,
    s3BackupMode: Option[String] = None,
    domainArn: Option[String] = None,
    indexRotationPeriod: Option[String] = None,
    typeName: Option[String] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty] = None,
    roleArn: Option[String] = None,
    bufferingHints: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.Builder)
      .cloudWatchLoggingOptions(cloudWatchLoggingOptions.orNull)
      .s3Configuration(s3Configuration.orNull)
      .retryOptions(retryOptions.orNull)
      .clusterEndpoint(clusterEndpoint.orNull)
      .indexName(indexName.orNull)
      .processingConfiguration(processingConfiguration.orNull)
      .s3BackupMode(s3BackupMode.orNull)
      .domainArn(domainArn.orNull)
      .indexRotationPeriod(indexRotationPeriod.orNull)
      .typeName(typeName.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .roleArn(roleArn.orNull)
      .bufferingHints(bufferingHints.orNull)
      .build()
}
