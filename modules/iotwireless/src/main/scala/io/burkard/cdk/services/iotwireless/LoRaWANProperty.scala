package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoRaWANProperty {

  def apply(
    rfRegion: String,
    dlClass: String,
    numberOfDevicesRequested: Option[Number] = None,
    numberOfDevicesInGroup: Option[Number] = None
  ): software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnMulticastGroup.LoRaWANProperty.Builder)
      .rfRegion(rfRegion)
      .dlClass(dlClass)
      .numberOfDevicesRequested(numberOfDevicesRequested.orNull)
      .numberOfDevicesInGroup(numberOfDevicesInGroup.orNull)
      .build()
}
