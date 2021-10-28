package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayRouteBaseProps {

  def apply(
    gatewayRouteName: Option[String] = None,
    routeSpec: Option[software.amazon.awscdk.services.appmesh.GatewayRouteSpec] = None
  ): software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps =
    (new software.amazon.awscdk.services.appmesh.GatewayRouteBaseProps.Builder)
      .gatewayRouteName(gatewayRouteName.orNull)
      .routeSpec(routeSpec.orNull)
      .build()
}
