package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRouteHostnameRewriteProperty {

  def apply(
    defaultTargetHostname: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameRewriteProperty.Builder)
      .defaultTargetHostname(defaultTargetHostname.orNull)
      .build()
}
