package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoRaWANGatewayProperty {

  def apply(
    rfRegion: String,
    gatewayEui: String
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessGateway.LoRaWANGatewayProperty.Builder)
      .rfRegion(rfRegion)
      .gatewayEui(gatewayEui)
      .build()
}
