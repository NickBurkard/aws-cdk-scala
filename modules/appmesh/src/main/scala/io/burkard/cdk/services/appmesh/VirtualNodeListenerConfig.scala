package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualNodeListenerConfig {

  def apply(
    listener: Option[software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty] = None
  ): software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig =
    (new software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig.Builder)
      .listener(listener.orNull)
      .build()
}
