package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualNodeListenerConfig {

  def apply(
    listener: software.amazon.awscdk.services.appmesh.CfnVirtualNode.ListenerProperty
  ): software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig =
    (new software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig.Builder)
      .listener(listener)
      .build()
}
