package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcGatewayRouteProperty {

  def apply(
    `match`: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteMatchProperty] = None,
    action: Option[software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteActionProperty] = None
  ): software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty =
    (new software.amazon.awscdk.services.appmesh.CfnGatewayRoute.GrpcGatewayRouteProperty.Builder)
      .`match`(`match`.orNull)
      .action(action.orNull)
      .build()
}
