package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LateDataRuleConfigurationProperty {

  def apply(
    deltaTimeSessionWindowConfiguration: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.DeltaTimeSessionWindowConfigurationProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty.Builder)
      .deltaTimeSessionWindowConfiguration(deltaTimeSessionWindowConfiguration.orNull)
      .build()
}
