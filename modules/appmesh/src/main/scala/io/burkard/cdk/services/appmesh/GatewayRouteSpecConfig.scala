package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRouteSpecConfig {

  def apply(
    grpcSpecConfig: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty] = None,
    httpSpecConfig: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty] = None,
    http2SpecConfig: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty] = None
  ): software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig =
    (new software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig.Builder)
      .grpcSpecConfig(grpcSpecConfig.orNull)
      .httpSpecConfig(httpSpecConfig.orNull)
      .http2SpecConfig(http2SpecConfig.orNull)
      .build()
}
