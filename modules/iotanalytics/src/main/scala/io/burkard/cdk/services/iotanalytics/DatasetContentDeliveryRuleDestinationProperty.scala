package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatasetContentDeliveryRuleDestinationProperty {

  def apply(
    iotEventsDestinationConfiguration: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.IotEventsDestinationConfigurationProperty] = None,
    s3DestinationConfiguration: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.S3DestinationConfigurationProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty.Builder)
      .iotEventsDestinationConfiguration(iotEventsDestinationConfiguration.orNull)
      .s3DestinationConfiguration(s3DestinationConfiguration.orNull)
      .build()
}
