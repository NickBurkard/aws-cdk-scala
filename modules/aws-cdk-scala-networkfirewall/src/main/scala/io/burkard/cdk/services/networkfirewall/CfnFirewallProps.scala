package io.burkard.cdk.services.networkfirewall

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFirewallProps {

  def apply(
    firewallPolicyArn: Option[String] = None,
    subnetMappings: Option[List[_]] = None,
    firewallPolicyChangeProtection: Option[Boolean] = None,
    vpcId: Option[String] = None,
    firewallName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    subnetChangeProtection: Option[Boolean] = None,
    deleteProtection: Option[Boolean] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallProps =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallProps.Builder)
      .firewallPolicyArn(firewallPolicyArn.orNull)
      .subnetMappings(subnetMappings.map(_.asJava).orNull)
      .firewallPolicyChangeProtection(firewallPolicyChangeProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpcId(vpcId.orNull)
      .firewallName(firewallName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .subnetChangeProtection(subnetChangeProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deleteProtection(deleteProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
