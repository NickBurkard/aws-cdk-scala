package io.burkard.cdk.services.kinesisfirehose

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AmazonopensearchserviceDestinationConfigurationProperty {

  def apply(
    s3Configuration: software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty,
    indexName: String,
    roleArn: String,
    cloudWatchLoggingOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.CloudWatchLoggingOptionsProperty] = None,
    retryOptions: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceRetryOptionsProperty] = None,
    clusterEndpoint: Option[String] = None,
    processingConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ProcessingConfigurationProperty] = None,
    s3BackupMode: Option[String] = None,
    domainArn: Option[String] = None,
    indexRotationPeriod: Option[String] = None,
    typeName: Option[String] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.VpcConfigurationProperty] = None,
    bufferingHints: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceBufferingHintsProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty.Builder)
      .s3Configuration(s3Configuration)
      .indexName(indexName)
      .roleArn(roleArn)
      .cloudWatchLoggingOptions(cloudWatchLoggingOptions.orNull)
      .retryOptions(retryOptions.orNull)
      .clusterEndpoint(clusterEndpoint.orNull)
      .processingConfiguration(processingConfiguration.orNull)
      .s3BackupMode(s3BackupMode.orNull)
      .domainArn(domainArn.orNull)
      .indexRotationPeriod(indexRotationPeriod.orNull)
      .typeName(typeName.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .bufferingHints(bufferingHints.orNull)
      .build()
}
