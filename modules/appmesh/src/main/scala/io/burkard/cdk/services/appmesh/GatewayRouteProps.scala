package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRouteProps {

  def apply(
    gatewayRouteName: Option[String] = None,
    routeSpec: Option[software.amazon.awscdk.services.appmesh.GatewayRouteSpec] = None,
    virtualGateway: Option[software.amazon.awscdk.services.appmesh.IVirtualGateway] = None
  ): software.amazon.awscdk.services.appmesh.GatewayRouteProps =
    (new software.amazon.awscdk.services.appmesh.GatewayRouteProps.Builder)
      .gatewayRouteName(gatewayRouteName.orNull)
      .routeSpec(routeSpec.orNull)
      .virtualGateway(virtualGateway.orNull)
      .build()
}
