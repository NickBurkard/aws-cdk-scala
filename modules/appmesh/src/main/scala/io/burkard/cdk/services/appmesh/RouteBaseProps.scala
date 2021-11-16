package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RouteBaseProps {

  def apply(
    routeSpec: software.amazon.awscdk.services.appmesh.RouteSpec,
    routeName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.RouteBaseProps =
    (new software.amazon.awscdk.services.appmesh.RouteBaseProps.Builder)
      .routeSpec(routeSpec)
      .routeName(routeName.orNull)
      .build()
}
