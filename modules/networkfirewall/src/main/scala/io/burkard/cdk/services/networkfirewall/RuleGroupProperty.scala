package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RuleGroupProperty {

  def apply(
    rulesSource: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RulesSourceProperty] = None,
    ruleVariables: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleVariablesProperty] = None,
    statefulRuleOptions: Option[software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.RuleGroupProperty.Builder)
      .rulesSource(rulesSource.orNull)
      .ruleVariables(ruleVariables.orNull)
      .statefulRuleOptions(statefulRuleOptions.orNull)
      .build()
}
