package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatefulRuleGroupReferenceProperty {

  def apply(
    resourceArn: String,
    priority: Option[Number] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.Builder)
      .resourceArn(resourceArn)
      .priority(priority.orNull)
      .build()
}
