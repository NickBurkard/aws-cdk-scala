package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRouteSpecProperty {

  def apply(
    grpcRoute: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty] = None,
    httpRoute: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty] = None,
    http2Route: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteSpecProperty.Builder)
      .grpcRoute(grpcRoute.orNull)
      .httpRoute(httpRoute.orNull)
      .http2Route(http2Route.orNull)
      .build()
}
