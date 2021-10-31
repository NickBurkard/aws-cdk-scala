package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
