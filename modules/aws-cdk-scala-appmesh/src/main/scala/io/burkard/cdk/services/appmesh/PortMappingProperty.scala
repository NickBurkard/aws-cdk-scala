package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object PortMappingProperty {

  def apply(
    port: Option[Number] = None,
    protocol: Option[String] = None
  ): software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty =
    (new software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty.Builder)
      .port(port.orNull)
      .protocol(protocol.orNull)
      .build()
}
