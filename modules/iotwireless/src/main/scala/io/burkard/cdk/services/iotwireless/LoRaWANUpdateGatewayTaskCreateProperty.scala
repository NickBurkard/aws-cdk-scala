package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LoRaWANUpdateGatewayTaskCreateProperty {

  def apply(
    updateVersion: Option[software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty] = None,
    updateSignature: Option[String] = None,
    sigKeyCrc: Option[Number] = None,
    currentVersion: Option[software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANGatewayVersionProperty] = None
  ): software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty.Builder)
      .updateVersion(updateVersion.orNull)
      .updateSignature(updateSignature.orNull)
      .sigKeyCrc(sigKeyCrc.orNull)
      .currentVersion(currentVersion.orNull)
      .build()
}
