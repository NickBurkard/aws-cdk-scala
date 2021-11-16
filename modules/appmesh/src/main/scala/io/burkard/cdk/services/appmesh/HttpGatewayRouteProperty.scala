package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpGatewayRouteProperty {

  def apply(
    `match`: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteMatchProperty,
    action: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteActionProperty
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.HttpGatewayRouteProperty.Builder)
      .`match`(`match`)
      .action(action)
      .build()
}
