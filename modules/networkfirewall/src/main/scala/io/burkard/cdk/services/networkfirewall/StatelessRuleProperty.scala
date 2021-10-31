package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatelessRuleProperty {

  def apply(
    priority: Option[Number] = None,
    ruleDefinition: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty.Builder)
      .priority(priority.orNull)
      .ruleDefinition(ruleDefinition.orNull)
      .build()
}
