package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualRouter {

  def apply(
    internalResourceId: String,
    mesh: software.amazon.awscdk.services.appmesh.IMesh,
    virtualRouterName: Option[String] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.appmesh.VirtualRouterListener]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.VirtualRouter =
    software.amazon.awscdk.services.appmesh.VirtualRouter.Builder
      .create(stackCtx, internalResourceId)
      .mesh(mesh)
      .virtualRouterName(virtualRouterName.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .build()
}
