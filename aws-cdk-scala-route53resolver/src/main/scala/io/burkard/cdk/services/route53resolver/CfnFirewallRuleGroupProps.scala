package io.burkard.cdk.services.route53resolver

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFirewallRuleGroupProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    firewallRules: Option[List[_]] = None
  ): software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps =
    (new software.amazon.awscdk.services.route53resolver.CfnFirewallRuleGroupProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .firewallRules(firewallRules.map(_.asJava).orNull)
      .build()
}
