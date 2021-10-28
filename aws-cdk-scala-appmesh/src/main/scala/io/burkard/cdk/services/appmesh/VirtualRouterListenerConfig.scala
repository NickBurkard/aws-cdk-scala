package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualRouterListenerConfig {

  def apply(
    listener: Option[software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty] = None
  ): software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig =
    (new software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig.Builder)
      .listener(listener.orNull)
      .build()
}
