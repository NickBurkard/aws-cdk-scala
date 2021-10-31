package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClientVpnRouteProps {

  def apply(
    targetVpcSubnetId: Option[String] = None,
    clientVpnEndpointId: Option[String] = None,
    description: Option[String] = None,
    destinationCidrBlock: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps =
    (new software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps.Builder)
      .targetVpcSubnetId(targetVpcSubnetId.orNull)
      .clientVpnEndpointId(clientVpnEndpointId.orNull)
      .description(description.orNull)
      .destinationCidrBlock(destinationCidrBlock.orNull)
      .build()
}
