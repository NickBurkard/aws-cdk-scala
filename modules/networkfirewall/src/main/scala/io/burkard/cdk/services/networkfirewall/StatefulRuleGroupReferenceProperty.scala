package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatefulRuleGroupReferenceProperty {

  def apply(
    resourceArn: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.Builder)
      .resourceArn(resourceArn.orNull)
      .build()
}
