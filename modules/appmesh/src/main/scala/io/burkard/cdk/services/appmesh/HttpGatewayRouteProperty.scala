package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
