package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClientVpnRoute {

  def apply(
    internalResourceId: String,
    targetVpcSubnetId: String,
    clientVpnEndpointId: String,
    destinationCidrBlock: String,
    description: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnClientVpnRoute =
    software.amazon.awscdk.services.ec2.CfnClientVpnRoute.Builder
      .create(stackCtx, internalResourceId)
      .targetVpcSubnetId(targetVpcSubnetId)
      .clientVpnEndpointId(clientVpnEndpointId)
      .destinationCidrBlock(destinationCidrBlock)
      .description(description.orNull)
      .build()
}
