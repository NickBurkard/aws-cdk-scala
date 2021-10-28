package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnGatewayRouteTableAssociation {

  def apply(
    internalResourceId: String,
    routeTableId: Option[String] = None,
    gatewayId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation =
    software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation.Builder
      .create(stackCtx, internalResourceId)
      .routeTableId(routeTableId.orNull)
      .gatewayId(gatewayId.orNull)
      .build()
}
