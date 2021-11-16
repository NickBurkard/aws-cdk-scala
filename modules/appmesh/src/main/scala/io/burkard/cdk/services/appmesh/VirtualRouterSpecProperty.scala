package io.burkard.cdk.services.appmesh

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualRouterSpecProperty {

  def apply(
    listeners: List[_]
  ): software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty.Builder)
      .listeners(listeners.asJava)
      .build()
}
