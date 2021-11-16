package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFirewallProps {

  def apply(
    firewallPolicyArn: String,
    subnetMappings: List[_],
    vpcId: String,
    firewallName: String,
    firewallPolicyChangeProtection: Option[Boolean] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    subnetChangeProtection: Option[Boolean] = None,
    deleteProtection: Option[Boolean] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallProps =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallProps.Builder)
      .firewallPolicyArn(firewallPolicyArn)
      .subnetMappings(subnetMappings.asJava)
      .vpcId(vpcId)
      .firewallName(firewallName)
      .firewallPolicyChangeProtection(firewallPolicyChangeProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .subnetChangeProtection(subnetChangeProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deleteProtection(deleteProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
