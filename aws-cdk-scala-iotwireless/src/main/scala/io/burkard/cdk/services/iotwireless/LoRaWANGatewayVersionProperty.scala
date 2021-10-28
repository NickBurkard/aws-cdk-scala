package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoRaWANGatewayVersionProperty {

  def apply(
    packageVersion: Option[String] = None,
    model: Option[String] = None,
    station: Option[String] = None
  ): software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty.Builder)
      .packageVersion(packageVersion.orNull)
      .model(model.orNull)
      .station(station.orNull)
      .build()
}
