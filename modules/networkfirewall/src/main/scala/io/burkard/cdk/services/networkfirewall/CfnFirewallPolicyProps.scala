package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFirewallPolicyProps {

  def apply(
    firewallPolicy: Option[software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty] = None,
    firewallPolicyName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicyProps.Builder)
      .firewallPolicy(firewallPolicy.orNull)
      .firewallPolicyName(firewallPolicyName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
