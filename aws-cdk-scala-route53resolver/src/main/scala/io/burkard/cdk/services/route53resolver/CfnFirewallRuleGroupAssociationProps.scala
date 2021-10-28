package io.burkard.cdk.services.route53resolver

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFirewallRuleGroupAssociationProps {

  def apply(
    mutationProtection: Option[String] = None,
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    firewallRuleGroupId: Option[String] = None,
    name: Option[String] = None,
    priority: Option[Number] = None
  ): software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps =
    (new software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps.Builder)
      .mutationProtection(mutationProtection.orNull)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .firewallRuleGroupId(firewallRuleGroupId.orNull)
      .name(name.orNull)
      .priority(priority.orNull)
      .build()
}
