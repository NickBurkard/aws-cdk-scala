package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualRouter {

  def apply(
    internalResourceId: String,
    virtualRouterName: Option[String] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.appmesh.VirtualRouterListener]] = None,
    mesh: Option[software.amazon.awscdk.services.appmesh.IMesh] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appmesh.VirtualRouter =
    software.amazon.awscdk.services.appmesh.VirtualRouter.Builder
      .create(stackCtx, internalResourceId)
      .virtualRouterName(virtualRouterName.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .mesh(mesh.orNull)
      .build()
}
