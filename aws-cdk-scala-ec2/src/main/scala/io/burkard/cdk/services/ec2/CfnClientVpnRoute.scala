package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnClientVpnRoute {

  def apply(
    internalResourceId: String,
    targetVpcSubnetId: Option[String] = None,
    clientVpnEndpointId: Option[String] = None,
    description: Option[String] = None,
    destinationCidrBlock: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnClientVpnRoute =
    software.amazon.awscdk.services.ec2.CfnClientVpnRoute.Builder
      .create(stackCtx, internalResourceId)
      .targetVpcSubnetId(targetVpcSubnetId.orNull)
      .clientVpnEndpointId(clientVpnEndpointId.orNull)
      .description(description.orNull)
      .destinationCidrBlock(destinationCidrBlock.orNull)
      .build()
}
