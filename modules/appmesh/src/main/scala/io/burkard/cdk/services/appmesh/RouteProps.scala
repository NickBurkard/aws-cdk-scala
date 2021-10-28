package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RouteProps {

  def apply(
    mesh: Option[software.amazon.awscdk.services.appmesh.IMesh] = None,
    routeSpec: Option[software.amazon.awscdk.services.appmesh.RouteSpec] = None,
    routeName: Option[String] = None,
    virtualRouter: Option[software.amazon.awscdk.services.appmesh.IVirtualRouter] = None
  ): software.amazon.awscdk.services.appmesh.RouteProps =
    (new software.amazon.awscdk.services.appmesh.RouteProps.Builder)
      .mesh(mesh.orNull)
      .routeSpec(routeSpec.orNull)
      .routeName(routeName.orNull)
      .virtualRouter(virtualRouter.orNull)
      .build()
}
