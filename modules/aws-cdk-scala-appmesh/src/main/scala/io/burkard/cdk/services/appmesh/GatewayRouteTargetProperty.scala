package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayRouteTargetProperty {

  def apply(
    virtualService: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty.Builder)
      .virtualService(virtualService.orNull)
      .build()
}
