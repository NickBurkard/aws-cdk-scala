package io.burkard.cdk.services.iotanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LateDataRuleProperty {

  def apply(
    ruleConfiguration: software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleConfigurationProperty,
    ruleName: Option[String] = None
  ): software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty =
    (new software.amazon.awscdk.services.iotanalytics.CfnDataset.LateDataRuleProperty.Builder)
      .ruleConfiguration(ruleConfiguration)
      .ruleName(ruleName.orNull)
      .build()
}
