package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VirtualGatewayListenerConfig {

  def apply(
    listener: Option[software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayListenerProperty] = None
  ): software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig =
    (new software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig.Builder)
      .listener(listener.orNull)
      .build()
}
