package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualRouterBaseProps {

  def apply(
    virtualRouterName: Option[String] = None,
    listeners: Option[List[_ <: software.amazon.awscdk.services.appmesh.VirtualRouterListener]] = None
  ): software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps =
    (new software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps.Builder)
      .virtualRouterName(virtualRouterName.orNull)
      .listeners(listeners.map(_.asJava).orNull)
      .build()
}
