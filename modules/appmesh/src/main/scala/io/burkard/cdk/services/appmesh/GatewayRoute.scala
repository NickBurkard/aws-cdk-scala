package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRoute {

  def apply(
    internalResourceId: String,
    virtualGateway: software.amazon.awscdk.services.appmesh.IVirtualGateway,
    gatewayRouteName: Option[String] = None,
    routeSpec: Option[software.amazon.awscdk.services.appmesh.GatewayRouteSpec] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.GatewayRoute =
    software.amazon.awscdk.services.appmesh.GatewayRoute.Builder
      .create(stackCtx, internalResourceId)
      .virtualGateway(virtualGateway)
      .gatewayRouteName(gatewayRouteName.orNull)
      .routeSpec(routeSpec.orNull)
      .build()
}
