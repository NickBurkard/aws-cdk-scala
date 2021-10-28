package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnLocalGatewayRouteProps {

  def apply(
    destinationCidrBlock: Option[String] = None,
    localGatewayRouteTableId: Option[String] = None,
    localGatewayVirtualInterfaceGroupId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps =
    (new software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps.Builder)
      .destinationCidrBlock(destinationCidrBlock.orNull)
      .localGatewayRouteTableId(localGatewayRouteTableId.orNull)
      .localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId.orNull)
      .build()
}