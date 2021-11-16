package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClientVpnTargetNetworkAssociation {

  def apply(
    internalResourceId: String,
    clientVpnEndpointId: String,
    subnetId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation =
    software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation.Builder
      .create(stackCtx, internalResourceId)
      .clientVpnEndpointId(clientVpnEndpointId)
      .subnetId(subnetId)
      .build()
}
