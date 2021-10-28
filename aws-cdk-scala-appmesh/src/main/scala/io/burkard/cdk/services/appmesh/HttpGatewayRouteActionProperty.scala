package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpGatewayRouteActionProperty {

  def apply(
    rewrite: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty] = None,
    target: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteTargetProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty.Builder)
      .rewrite(rewrite.orNull)
      .target(target.orNull)
      .build()
}
