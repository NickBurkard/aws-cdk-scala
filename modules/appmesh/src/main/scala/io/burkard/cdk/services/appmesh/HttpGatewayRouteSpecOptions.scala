package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpGatewayRouteSpecOptions {

  def apply(
    `match`: Option[software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch] = None,
    routeTarget: Option[software.amazon.awscdk.services.appmesh.IVirtualService] = None
  ): software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions =
    (new software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions.Builder)
      .`match`(`match`.orNull)
      .routeTarget(routeTarget.orNull)
      .build()
}