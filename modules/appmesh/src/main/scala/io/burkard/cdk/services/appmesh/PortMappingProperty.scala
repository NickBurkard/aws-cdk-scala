package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object PortMappingProperty {

  def apply(
    port: Number,
    protocol: String
  ): software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualNode.PortMappingProperty.Builder)
      .port(port)
      .protocol(protocol)
      .build()
}
