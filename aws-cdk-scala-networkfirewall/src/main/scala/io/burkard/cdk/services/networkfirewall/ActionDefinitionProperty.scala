package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ActionDefinitionProperty {

  def apply(
    publishMetricAction: Option[software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty.Builder)
      .publishMetricAction(publishMetricAction.orNull)
      .build()
}
