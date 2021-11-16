package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcGatewayRouteActionProperty {

  def apply(
    target: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty,
    rewrite: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteRewriteProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty.Builder)
      .target(target)
      .rewrite(rewrite.orNull)
      .build()
}
