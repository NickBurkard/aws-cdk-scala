package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PortRangeProperty {

  def apply(
    toPort: Number,
    fromPort: Number
  ): software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnRuleGroup.PortRangeProperty.Builder)
      .toPort(toPort)
      .fromPort(fromPort)
      .build()
}
