package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayPortMappingProperty {

  def apply(
    port: Option[Number] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty.Builder)
      .port(port.orNull)
      .protocol(protocol.orNull)
      .build()
}
