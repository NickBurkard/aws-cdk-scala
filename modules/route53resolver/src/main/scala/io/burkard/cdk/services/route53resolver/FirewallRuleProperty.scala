package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FirewallRuleProperty {

  def apply(
    action: String,
    priority: Number,
    firewallDomainListId: String,
    blockOverrideDnsType: Option[String] = None,
    blockResponse: Option[String] = None,
    blockOverrideTtl: Option[Number] = None,
    blockOverrideDomain: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty =
    (new software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty.Builder)
      .action(action)
      .priority(priority)
      .firewallDomainListId(firewallDomainListId)
      .blockOverrideDnsType(blockOverrideDnsType.orNull)
      .blockResponse(blockResponse.orNull)
      .blockOverrideTtl(blockOverrideTtl.orNull)
      .blockOverrideDomain(blockOverrideDomain.orNull)
      .build()
}
