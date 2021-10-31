package io.burkard.cdk.services.route53resolver

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
