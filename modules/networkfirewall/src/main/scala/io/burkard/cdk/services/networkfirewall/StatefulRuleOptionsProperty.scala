package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatefulRuleOptionsProperty {

  def apply(
    ruleOrder: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.StatefulRuleOptionsProperty.Builder)
      .ruleOrder(ruleOrder.orNull)
      .build()
}
