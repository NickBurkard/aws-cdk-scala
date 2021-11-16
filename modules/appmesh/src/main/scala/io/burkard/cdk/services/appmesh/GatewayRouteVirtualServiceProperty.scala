package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRouteVirtualServiceProperty {

  def apply(
    virtualServiceName: String
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty.Builder)
      .virtualServiceName(virtualServiceName)
      .build()
}
