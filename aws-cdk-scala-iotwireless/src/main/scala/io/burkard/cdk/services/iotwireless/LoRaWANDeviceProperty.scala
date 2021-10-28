package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LoRaWANDeviceProperty {

  def apply(
    abpV11: Option[software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property] = None,
    otaaV10X: Option[software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty] = None,
    serviceProfileId: Option[String] = None,
    abpV10X: Option[software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty] = None,
    deviceProfileId: Option[String] = None,
    devEui: Option[String] = None,
    otaaV11: Option[software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property] = None
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.LoRaWANDeviceProperty.Builder)
      .abpV11(abpV11.orNull)
      .otaaV10X(otaaV10X.orNull)
      .serviceProfileId(serviceProfileId.orNull)
      .abpV10X(abpV10X.orNull)
      .deviceProfileId(deviceProfileId.orNull)
      .devEui(devEui.orNull)
      .otaaV11(otaaV11.orNull)
      .build()
}
