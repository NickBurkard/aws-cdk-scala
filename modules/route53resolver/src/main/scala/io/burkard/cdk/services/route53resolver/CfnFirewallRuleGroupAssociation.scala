package io.burkard.cdk.services.route53resolver

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFirewallRuleGroupAssociation {

  def apply(
    internalResourceId: String,
    vpcId: String,
    firewallRuleGroupId: String,
    priority: Number,
    mutationProtection: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    name: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation =
    software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupAssociation.Builder
      .create(stackCtx, internalResourceId)
      .vpcId(vpcId)
      .firewallRuleGroupId(firewallRuleGroupId)
      .priority(priority)
      .mutationProtection(mutationProtection.orNull)
      .tags(tags.map(_.asJava).orNull)
      .name(name.orNull)
      .build()
}
