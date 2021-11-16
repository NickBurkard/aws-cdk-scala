package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayListenerConfig {

  def apply(
    listener: software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty
  ): software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig =
    (new software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig.Builder)
      .listener(listener)
      .build()
}
