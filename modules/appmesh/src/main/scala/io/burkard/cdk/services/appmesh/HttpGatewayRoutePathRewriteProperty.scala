package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpGatewayRoutePathRewriteProperty {

  def apply(
    exact: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRoutePathRewriteProperty.Builder)
      .exact(exact.orNull)
      .build()
}
