package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoRaWANGatewayProperty {

  def apply(
    rfRegion: Option[String] = None,
    gatewayEui: Option[String] = None
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty.Builder)
      .rfRegion(rfRegion.orNull)
      .gatewayEui(gatewayEui.orNull)
      .build()
}
