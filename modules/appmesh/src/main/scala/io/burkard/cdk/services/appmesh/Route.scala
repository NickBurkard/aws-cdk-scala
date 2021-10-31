package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Route {

  def apply(
    internalResourceId: String,
    mesh: Option[software.amazon.awscdk.services.appmesh.IMesh] = None,
    routeSpec: Option[software.amazon.awscdk.services.appmesh.RouteSpec] = None,
    routeName: Option[String] = None,
    virtualRouter: Option[software.amazon.awscdk.services.appmesh.IVirtualRouter] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.Route =
    software.amazon.awscdk.services.appmesh.Route.Builder
      .create(stackCtx, internalResourceId)
      .mesh(mesh.orNull)
      .routeSpec(routeSpec.orNull)
      .routeName(routeName.orNull)
      .virtualRouter(virtualRouter.orNull)
      .build()
}
