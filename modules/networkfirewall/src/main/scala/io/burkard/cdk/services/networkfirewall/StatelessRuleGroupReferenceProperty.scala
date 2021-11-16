package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatelessRuleGroupReferenceProperty {

  def apply(
    priority: Number,
    resourceArn: String
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.Builder)
      .priority(priority)
      .resourceArn(resourceArn)
      .build()
}
