package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocalGatewayRoute {

  def apply(
    internalResourceId: String,
    destinationCidrBlock: String,
    localGatewayRouteTableId: String,
    localGatewayVirtualInterfaceGroupId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute =
    software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute.Builder
      .create(stackCtx, internalResourceId)
      .destinationCidrBlock(destinationCidrBlock)
      .localGatewayRouteTableId(localGatewayRouteTableId)
      .localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
      .build()
}
