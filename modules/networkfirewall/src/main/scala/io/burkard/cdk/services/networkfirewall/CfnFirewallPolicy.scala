package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnFirewallPolicy {

  def apply(
    internalResourceId: String,
    firewallPolicy: Option[software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty] = None,
    firewallPolicyName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy =
    software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.Builder
      .create(stackCtx, internalResourceId)
      .firewallPolicy(firewallPolicy.orNull)
      .firewallPolicyName(firewallPolicyName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
