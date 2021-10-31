package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpGatewayRouteRewriteProperty {

  def apply(
    prefix: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePrefixRewriteProperty] = None,
    path: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty] = None,
    hostname: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteRewriteProperty.Builder)
      .prefix(prefix.orNull)
      .path(path.orNull)
      .hostname(hostname.orNull)
      .build()
}
