package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocalGatewayRouteProps {

  def apply(
    destinationCidrBlock: String,
    localGatewayRouteTableId: String,
    localGatewayVirtualInterfaceGroupId: String
  ): software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps =
    (new software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps.Builder)
      .destinationCidrBlock(destinationCidrBlock)
      .localGatewayRouteTableId(localGatewayRouteTableId)
      .localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
      .build()
}
