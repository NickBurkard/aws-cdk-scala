package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GatewayRouteRangeMatchProperty {

  def apply(
    end: Number,
    start: Number
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty.Builder)
      .end(end)
      .start(start)
      .build()
}
