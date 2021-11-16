package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcGatewayRouteProperty {

  def apply(
    `match`: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty,
    action: software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty.Builder)
      .`match`(`match`)
      .action(action)
      .build()
}
