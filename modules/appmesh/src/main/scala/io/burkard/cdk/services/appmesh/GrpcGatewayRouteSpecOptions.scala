package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcGatewayRouteSpecOptions {

  def apply(
    `match`: Option[software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch] = None,
    routeTarget: Option[software.amazon.awscdk.services.appmesh.IVirtualService] = None
  ): software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions =
    (new software.amazon.awscdk.services.appmesh.GrpcGatewayRouteSpecOptions.Builder)
      .`match`(`match`.orNull)
      .routeTarget(routeTarget.orNull)
      .build()
}
