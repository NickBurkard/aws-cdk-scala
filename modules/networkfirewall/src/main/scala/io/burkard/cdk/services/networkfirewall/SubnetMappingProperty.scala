package io.burkard.cdk.services.networkfirewall

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SubnetMappingProperty {

  def apply(
    subnetId: String
  ): software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty =
    (new software.amazon.awscdk.services.networkfirewall.CfnFirewall.SubnetMappingProperty.Builder)
      .subnetId(subnetId)
      .build()
}
