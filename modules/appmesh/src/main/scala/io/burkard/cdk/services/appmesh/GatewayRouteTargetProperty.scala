package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRouteTargetProperty {

  def apply(
    virtualService: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty.Builder)
      .virtualService(virtualService.orNull)
      .build()
}
