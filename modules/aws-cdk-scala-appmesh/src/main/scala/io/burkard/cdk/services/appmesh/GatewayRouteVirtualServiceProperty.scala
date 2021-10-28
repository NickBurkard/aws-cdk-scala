package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayRouteVirtualServiceProperty {

  def apply(
    virtualServiceName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty.Builder)
      .virtualServiceName(virtualServiceName.orNull)
      .build()
}
