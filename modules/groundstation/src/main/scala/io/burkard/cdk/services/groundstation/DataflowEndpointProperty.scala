package io.burkard.cdk.services.groundstation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DataflowEndpointProperty {

  def apply(
    name: Option[String] = None,
    mtu: Option[Number] = None,
    address: Option[software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty] = None
  ): software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty =
    (new software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty.Builder)
      .name(name.orNull)
      .mtu(mtu.orNull)
      .address(address.orNull)
      .build()
}
