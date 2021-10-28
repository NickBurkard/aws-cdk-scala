package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SubnetMappingProperty {

  def apply(
    subnetId: Option[String] = None
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty.Builder)
      .subnetId(subnetId.orNull)
      .build()
}
