package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualNodeListenerConfig {

  def apply(
    listener: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty] = None
  ): software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig =
    (new software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig.Builder)
      .listener(listener.orNull)
      .build()
}
