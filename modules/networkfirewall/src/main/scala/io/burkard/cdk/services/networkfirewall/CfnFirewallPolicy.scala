package io.burkard.cdk.services.networkfirewall

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFirewallPolicy {

  def apply(
    internalResourceId: String,
    firewallPolicy: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty,
    firewallPolicyName: String,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy =
    software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.Builder
      .create(stackCtx, internalResourceId)
      .firewallPolicy(firewallPolicy)
      .firewallPolicyName(firewallPolicyName)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
