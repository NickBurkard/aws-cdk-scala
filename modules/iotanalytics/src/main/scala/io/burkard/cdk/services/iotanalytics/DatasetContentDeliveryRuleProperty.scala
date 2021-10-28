package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatasetContentDeliveryRuleProperty {

  def apply(
    entryName: Option[String] = None,
    destination: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty.Builder)
      .entryName(entryName.orNull)
      .destination(destination.orNull)
      .build()
}