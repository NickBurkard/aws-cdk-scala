package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGatewayRouteTableAssociationProps {

  def apply(
    routeTableId: Option[String] = None,
    gatewayId: Option[String] = None
  ): software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps =
    (new software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps.Builder)
      .routeTableId(routeTableId.orNull)
      .gatewayId(gatewayId.orNull)
      .build()
}
