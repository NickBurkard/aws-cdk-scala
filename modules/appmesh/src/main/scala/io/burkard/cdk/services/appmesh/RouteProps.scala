package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RouteProps {

  def apply(
    mesh: software.amazon.awscdk.services.appmesh.IMesh,
    virtualRouter: software.amazon.awscdk.services.appmesh.IVirtualRouter,
    routeSpec: Option[software.amazon.awscdk.services.appmesh.RouteSpec] = None,
    routeName: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.RouteProps =
    (new software.amazon.awscdk.services.appmesh.RouteProps.Builder)
      .mesh(mesh)
      .virtualRouter(virtualRouter)
      .routeSpec(routeSpec.orNull)
      .routeName(routeName.orNull)
      .build()
}
