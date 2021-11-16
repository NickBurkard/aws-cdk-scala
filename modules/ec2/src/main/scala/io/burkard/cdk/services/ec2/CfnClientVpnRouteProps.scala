package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClientVpnRouteProps {

  def apply(
    targetVpcSubnetId: String,
    clientVpnEndpointId: String,
    destinationCidrBlock: String,
    description: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps.Builder)
      .targetVpcSubnetId(targetVpcSubnetId)
      .clientVpnEndpointId(clientVpnEndpointId)
      .destinationCidrBlock(destinationCidrBlock)
      .description(description.orNull)
      .build()
}
