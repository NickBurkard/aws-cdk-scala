package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VirtualGatewayPortMappingProperty {

  def apply(
    port: Number,
    protocol: String
  ): software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualGateway.VirtualGatewayPortMappingProperty.Builder)
      .port(port)
      .protocol(protocol)
      .build()
}
