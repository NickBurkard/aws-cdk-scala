package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
