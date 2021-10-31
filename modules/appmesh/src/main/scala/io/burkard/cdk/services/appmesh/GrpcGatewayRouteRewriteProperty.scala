package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcGatewayRouteRewriteProperty {

  def apply(
    hostname: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty.Builder)
      .hostname(hostname.orNull)
      .build()
}
