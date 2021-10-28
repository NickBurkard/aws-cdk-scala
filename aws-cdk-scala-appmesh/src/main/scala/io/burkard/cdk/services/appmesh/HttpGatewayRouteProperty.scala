package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpGatewayRouteProperty {

  def apply(
    `match`: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty] = None,
    action: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty.Builder)
      .`match`(`match`.orNull)
      .action(action.orNull)
      .build()
}
