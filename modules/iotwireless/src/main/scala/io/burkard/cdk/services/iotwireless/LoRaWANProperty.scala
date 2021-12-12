package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoRaWANProperty {

  def apply(
    rfRegion: String,
    startTime: Option[String] = None
  ): software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnFuotaTask.LoRaWANProperty.Builder)
      .rfRegion(rfRegion)
      .startTime(startTime.orNull)
      .build()
}
