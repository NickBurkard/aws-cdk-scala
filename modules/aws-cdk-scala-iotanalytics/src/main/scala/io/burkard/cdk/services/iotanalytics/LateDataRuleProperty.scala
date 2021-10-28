package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LateDataRuleProperty {

  def apply(
    ruleName: Option[String] = None,
    ruleConfiguration: Option[software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty.Builder)
      .ruleName(ruleName.orNull)
      .ruleConfiguration(ruleConfiguration.orNull)
      .build()
}
