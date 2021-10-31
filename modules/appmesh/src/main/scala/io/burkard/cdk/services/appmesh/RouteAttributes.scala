package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RouteAttributes {

  def apply(
    routeName: Option[String] = None,
    virtualRouter: Option[software.amazon.awscdk.services.appmesh.IVirtualRouter] = None
  ): software.amazon.awscdk.services.appmesh.RouteAttributes =
    (new software.amazon.awscdk.services.appmesh.RouteAttributes.Builder)
      .routeName(routeName.orNull)
      .virtualRouter(virtualRouter.orNull)
      .build()
}
