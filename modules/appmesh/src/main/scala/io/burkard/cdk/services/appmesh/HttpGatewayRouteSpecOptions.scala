package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpGatewayRouteSpecOptions {

  def apply(
    routeTarget: software.amazon.awscdk.services.appmesh.IVirtualService,
    `match`: Option[software.amazon.awscdk.services.appmesh.HttpGatewayRouteMatch] = None
  ): software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions =
    (new software.amazon.awscdk.services.appmesh.HttpGatewayRouteSpecOptions.Builder)
      .routeTarget(routeTarget)
      .`match`(`match`.orNull)
      .build()
}
