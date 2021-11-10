package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatefulRuleGroupReferenceProperty {

  def apply(
    priority: Option[Number] = None,
    resourceArn: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.Builder)
      .priority(priority.orNull)
      .resourceArn(resourceArn.orNull)
      .build()
}
