package io.burkard.cdk.services.kinesisfirehose

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDeliveryStreamProps {

  def apply(
    kinesisStreamSourceConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.KinesisStreamSourceConfigurationProperty] = None,
    extendedS3DestinationConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ExtendedS3DestinationConfigurationProperty] = None,
    elasticsearchDestinationConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.ElasticsearchDestinationConfigurationProperty] = None,
    splunkDestinationConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.SplunkDestinationConfigurationProperty] = None,
    deliveryStreamName: Option[String] = None,
    s3DestinationConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.S3DestinationConfigurationProperty] = None,
    deliveryStreamType: Option[String] = None,
    amazonopensearchserviceDestinationConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.AmazonopensearchserviceDestinationConfigurationProperty] = None,
    deliveryStreamEncryptionConfigurationInput: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.DeliveryStreamEncryptionConfigurationInputProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    redshiftDestinationConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.RedshiftDestinationConfigurationProperty] = None,
    httpEndpointDestinationConfiguration: Option[software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream.HttpEndpointDestinationConfigurationProperty] = None
  ): software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps =
    (new software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStreamProps.Builder)
      .kinesisStreamSourceConfiguration(kinesisStreamSourceConfiguration.orNull)
      .extendedS3DestinationConfiguration(extendedS3DestinationConfiguration.orNull)
      .elasticsearchDestinationConfiguration(elasticsearchDestinationConfiguration.orNull)
      .splunkDestinationConfiguration(splunkDestinationConfiguration.orNull)
      .deliveryStreamName(deliveryStreamName.orNull)
      .s3DestinationConfiguration(s3DestinationConfiguration.orNull)
      .deliveryStreamType(deliveryStreamType.orNull)
      .amazonopensearchserviceDestinationConfiguration(amazonopensearchserviceDestinationConfiguration.orNull)
      .deliveryStreamEncryptionConfigurationInput(deliveryStreamEncryptionConfigurationInput.orNull)
      .tags(tags.map(_.asJava).orNull)
      .redshiftDestinationConfiguration(redshiftDestinationConfiguration.orNull)
      .httpEndpointDestinationConfiguration(httpEndpointDestinationConfiguration.orNull)
      .build()
}
