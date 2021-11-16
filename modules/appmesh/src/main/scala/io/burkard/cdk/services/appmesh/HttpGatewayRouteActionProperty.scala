package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpGatewayRouteActionProperty {

  def apply(
    target: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty,
    rewrite: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty.Builder)
      .target(target)
      .rewrite(rewrite.orNull)
      .build()
}
