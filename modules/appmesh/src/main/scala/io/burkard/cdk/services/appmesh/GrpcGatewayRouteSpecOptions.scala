package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcGatewayRouteSpecOptions {

  def apply(
    `match`: software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch,
    routeTarget: software.amazon.awscdk.services.appmesh.IVirtualService
  ): software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions =
    (new software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions.Builder)
      .`match`(`match`)
      .routeTarget(routeTarget)
      .build()
}
