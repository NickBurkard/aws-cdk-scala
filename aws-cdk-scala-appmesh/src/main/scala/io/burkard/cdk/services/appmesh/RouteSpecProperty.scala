package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RouteSpecProperty {

  def apply(
    grpcRoute: Option[software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty] = None,
    priority: Option[Number] = None,
    httpRoute: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty] = None,
    http2Route: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty] = None,
    tcpRoute: Option[software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty =
    (new software.amazon.awscdk.services.appmesh.CfnRoute.RouteSpecProperty.Builder)
      .grpcRoute(grpcRoute.orNull)
      .priority(priority.orNull)
      .httpRoute(httpRoute.orNull)
      .http2Route(http2Route.orNull)
      .tcpRoute(tcpRoute.orNull)
      .build()
}
