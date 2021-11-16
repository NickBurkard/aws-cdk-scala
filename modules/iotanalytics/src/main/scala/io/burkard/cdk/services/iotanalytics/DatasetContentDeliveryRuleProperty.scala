package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatasetContentDeliveryRuleProperty {

  def apply(
    destination: software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleDestinationProperty,
    entryName: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.DatasetContentDeliveryRuleProperty.Builder)
      .destination(destination)
      .entryName(entryName.orNull)
      .build()
}
