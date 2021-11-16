package io.burkard.cdk.services.route53resolver

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFirewallRuleGroupAssociationProps {

  def apply(
    vpcId: String,
    firewallRuleGroupId: String,
    priority: Number,
    mutationProtection: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    name: Option[String] = None
  ): software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps =
    (new software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociationProps.Builder)
      .vpcId(vpcId)
      .firewallRuleGroupId(firewallRuleGroupId)
      .priority(priority)
      .mutationProtection(mutationProtection.orNull)
      .tags(tags.map(_.asJava).orNull)
      .name(name.orNull)
      .build()
}
