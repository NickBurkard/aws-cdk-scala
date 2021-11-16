package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRouteBaseProps {

  def apply(
    routeSpec: software.amazon.awscdk.services.appmesh.GatewayRouteSpec,
    gatewayRouteName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps =
    (new software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps.Builder)
      .routeSpec(routeSpec)
      .gatewayRouteName(gatewayRouteName.orNull)
      .build()
}
