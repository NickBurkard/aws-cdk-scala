package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoRaWANUpdateGatewayTaskEntryProperty {

  def apply(
    updateVersion: Option[software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty] = None,
    currentVersion: Option[software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty] = None
  ): software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.Builder)
      .updateVersion(updateVersion.orNull)
      .currentVersion(currentVersion.orNull)
      .build()
}
