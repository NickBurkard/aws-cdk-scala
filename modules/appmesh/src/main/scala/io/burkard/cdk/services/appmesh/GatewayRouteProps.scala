package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRouteProps {

  def apply(
    virtualGateway: software.amazon.awscdk.services.appmesh.IVirtualGateway,
    gatewayRouteName: Option[String] = None,
    routeSpec: Option[software.amazon.awscdk.services.appmesh.GatewayRouteSpec] = None
  ): software.amazon.awscdk.services.appmesh.GatewayRouteProps =
    (new software.amazon.awscdk.services.appmesh.GatewayRouteProps.Builder)
      .virtualGateway(virtualGateway)
      .gatewayRouteName(gatewayRouteName.orNull)
      .routeSpec(routeSpec.orNull)
      .build()
}
