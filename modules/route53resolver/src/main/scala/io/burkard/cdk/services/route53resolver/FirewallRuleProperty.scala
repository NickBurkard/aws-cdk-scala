package io.burkard.cdk.services.route53resolver

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FirewallRuleProperty {

  def apply(
    blockOverrideDnsType: Option[String] = None,
    blockResponse: Option[String] = None,
    action: Option[String] = None,
    blockOverrideTtl: Option[Number] = None,
    priority: Option[Number] = None,
    blockOverrideDomain: Option[String] = None,
    firewallDomainListId: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty =
    (new software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroup.FirewallRuleProperty.Builder)
      .blockOverrideDnsType(blockOverrideDnsType.orNull)
      .blockResponse(blockResponse.orNull)
      .action(action.orNull)
      .blockOverrideTtl(blockOverrideTtl.orNull)
      .priority(priority.orNull)
      .blockOverrideDomain(blockOverrideDomain.orNull)
      .firewallDomainListId(firewallDomainListId.orNull)
      .build()
}
