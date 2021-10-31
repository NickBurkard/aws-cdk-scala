package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLocalGatewayRoute {

  def apply(
    internalResourceId: String,
    destinationCidrBlock: Option[String] = None,
    localGatewayRouteTableId: Option[String] = None,
    localGatewayVirtualInterfaceGroupId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute =
    software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute.Builder
      .create(stackCtx, internalResourceId)
      .destinationCidrBlock(destinationCidrBlock.orNull)
      .localGatewayRouteTableId(localGatewayRouteTableId.orNull)
      .localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId.orNull)
      .build()
}
