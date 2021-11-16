package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGatewayRouteTableAssociation {

  def apply(
    internalResourceId: String,
    routeTableId: String,
    gatewayId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation =
    software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation.Builder
      .create(stackCtx, internalResourceId)
      .routeTableId(routeTableId)
      .gatewayId(gatewayId)
      .build()
}
