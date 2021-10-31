package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RouteSpecConfig {

  def apply(
    httpRouteSpec: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty] = None,
    priority: Option[Number] = None,
    grpcRouteSpec: Option[software.amazon.awscdk.services.appmesh.CfnRoute.GrpcRouteProperty] = None,
    tcpRouteSpec: Option[software.amazon.awscdk.services.appmesh.CfnRoute.TcpRouteProperty] = None,
    http2RouteSpec: Option[software.amazon.awscdk.services.appmesh.CfnRoute.HttpRouteProperty] = None
  ): software.amazon.awscdk.services.appmesh.RouteSpecConfig =
    (new software.amazon.awscdk.services.appmesh.RouteSpecConfig.Builder)
      .httpRouteSpec(httpRouteSpec.orNull)
      .priority(priority.orNull)
      .grpcRouteSpec(grpcRouteSpec.orNull)
      .tcpRouteSpec(tcpRouteSpec.orNull)
      .http2RouteSpec(http2RouteSpec.orNull)
      .build()
}
