package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GatewayRouteRangeMatchProperty {

  def apply(
    end: Option[Number] = None,
    start: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GatewayRouteRangeMatchProperty.Builder)
      .end(end.orNull)
      .start(start.orNull)
      .build()
}
