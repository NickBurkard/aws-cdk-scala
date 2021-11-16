package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClientVpnTargetNetworkAssociationProps {

  def apply(
    clientVpnEndpointId: String,
    subnetId: String
  ): software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps.Builder)
      .clientVpnEndpointId(clientVpnEndpointId)
      .subnetId(subnetId)
      .build()
}
