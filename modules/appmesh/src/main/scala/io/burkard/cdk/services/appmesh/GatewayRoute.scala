package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayRoute {

  def apply(
    internalResourceId: String,
    gatewayRouteName: Option[String] = None,
    routeSpec: Option[software.amazon.awscdk.services.appmesh.GatewayRouteSpec] = None,
    virtualGateway: Option[software.amazon.awscdk.services.appmesh.IVirtualGateway] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.GatewayRoute =
    software.amazon.awscdk.services.appmesh.GatewayRoute.Builder
      .create(stackCtx, internalResourceId)
      .gatewayRouteName(gatewayRouteName.orNull)
      .routeSpec(routeSpec.orNull)
      .virtualGateway(virtualGateway.orNull)
      .build()
}
