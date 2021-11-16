package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RouteAttributes {

  def apply(
    routeName: String,
    virtualRouter: software.amazon.awscdk.services.appmesh.IVirtualRouter
  ): software.amazon.awscdk.services.appmesh.RouteAttributes =
    (new software.amazon.awscdk.services.appmesh.RouteAttributes.Builder)
      .routeName(routeName)
      .virtualRouter(virtualRouter)
      .build()
}
