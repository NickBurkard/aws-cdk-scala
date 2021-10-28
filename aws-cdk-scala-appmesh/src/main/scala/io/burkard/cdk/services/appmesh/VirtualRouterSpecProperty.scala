package io.burkard.cdk.services.appmesh

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualRouterSpecProperty {

  def apply(
    listeners: Option[List[_]] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty.Builder)
      .listeners(listeners.map(_.asJava).orNull)
      .build()
}
