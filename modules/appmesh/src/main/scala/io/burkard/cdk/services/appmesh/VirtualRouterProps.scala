package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualRouterProps {

  def apply(
    virtualRouterName: Option[String] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.appmesh.VirtualRouterListener]] = None,
    mesh: Option[software.amazon.awscdk.services.appmesh.IMesh] = None
  ): software.amazon.awscdk.services.appmesh.VirtualRouterProps =
    (new software.amazon.awscdk.services.appmesh.VirtualRouterProps.Builder)
      .virtualRouterName(virtualRouterName.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .mesh(mesh.orNull)
      .build()
}
