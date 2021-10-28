package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayRouteAttributes {

  def apply(
    gatewayRouteName: Option[String] = None,
    virtualGateway: Option[software.amazon.awscdk.services.appmesh.IVirtualGateway] = None
  ): software.amazon.awscdk.services.appmesh.GatewayRouteAttributes =
    (new software.amazon.awscdk.services.appmesh.GatewayRouteAttributes.Builder)
      .gatewayRouteName(gatewayRouteName.orNull)
      .virtualGateway(virtualGateway.orNull)
      .build()
}
