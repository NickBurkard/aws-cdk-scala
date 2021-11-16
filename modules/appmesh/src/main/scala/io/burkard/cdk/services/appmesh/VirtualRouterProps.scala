package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualRouterProps {

  def apply(
    mesh: software.amazon.awscdk.services.appmesh.IMesh,
    virtualRouterName: Option[String] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.appmesh.VirtualRouterListener]] = None
  ): software.amazon.awscdk.services.appmesh.VirtualRouterProps =
    (new software.amazon.awscdk.services.appmesh.VirtualRouterProps.Builder)
      .mesh(mesh)
      .virtualRouterName(virtualRouterName.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .build()
}
