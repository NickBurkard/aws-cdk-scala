package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRouteVirtualServiceProperty {

  def apply(
    virtualServiceName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteVirtualServiceProperty.Builder)
      .virtualServiceName(virtualServiceName.orNull)
      .build()
}
