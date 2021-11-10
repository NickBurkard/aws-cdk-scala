package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatefulEngineOptionsProperty {

  def apply(
    ruleOrder: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty.Builder)
      .ruleOrder(ruleOrder.orNull)
      .build()
}
