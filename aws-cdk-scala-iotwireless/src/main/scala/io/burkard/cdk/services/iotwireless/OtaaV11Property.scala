package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OtaaV11Property {

  def apply(
    appKey: Option[String] = None,
    nwkKey: Option[String] = None,
    joinEui: Option[String] = None
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property.Builder)
      .appKey(appKey.orNull)
      .nwkKey(nwkKey.orNull)
      .joinEui(joinEui.orNull)
      .build()
}
