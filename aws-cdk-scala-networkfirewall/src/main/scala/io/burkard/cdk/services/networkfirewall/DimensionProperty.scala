package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DimensionProperty {

  def apply(
    value: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty.Builder)
      .value(value.orNull)
      .build()
}
