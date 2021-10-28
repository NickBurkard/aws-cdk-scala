package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SocketAddressProperty {

  def apply(
    name: Option[String] = None,
    port: Option[Number] = None
  ): software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty =
    (new software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty.Builder)
      .name(name.orNull)
      .port(port.orNull)
      .build()
}
