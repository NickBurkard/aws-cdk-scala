package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatelessRuleProperty {

  def apply(
    priority: Number,
    ruleDefinition: software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleDefinitionProperty
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatelessRuleProperty.Builder)
      .priority(priority)
      .ruleDefinition(ruleDefinition)
      .build()
}
