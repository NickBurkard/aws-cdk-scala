package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StatelessRuleGroupReferenceProperty {

  def apply(
    priority: Option[Number] = None,
    resourceArn: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.Builder)
      .priority(priority.orNull)
      .resourceArn(resourceArn.orNull)
      .build()
}
