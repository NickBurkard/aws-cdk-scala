package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRouteAttributes {

  def apply(
    gatewayRouteName: String,
    virtualGateway: software.amazon.awscdk.services.appmesh.IVirtualGateway
  ): software.amazon.awscdk.services.appmesh.GatewayRouteAttributes =
    (new software.amazon.awscdk.services.appmesh.GatewayRouteAttributes.Builder)
      .gatewayRouteName(gatewayRouteName)
      .virtualGateway(virtualGateway)
      .build()
}
