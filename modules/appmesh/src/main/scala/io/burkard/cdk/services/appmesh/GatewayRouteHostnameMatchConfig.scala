package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRouteHostnameMatchConfig {

  def apply(
    hostnameMatch: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteHostnameMatchProperty
  ): software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig =
    (new software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig.Builder)
      .hostnameMatch(hostnameMatch)
      .build()
}
