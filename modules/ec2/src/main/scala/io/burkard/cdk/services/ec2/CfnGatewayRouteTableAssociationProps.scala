package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGatewayRouteTableAssociationProps {

  def apply(
    routeTableId: String,
    gatewayId: String
  ): software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps.Builder)
      .routeTableId(routeTableId)
      .gatewayId(gatewayId)
      .build()
}
