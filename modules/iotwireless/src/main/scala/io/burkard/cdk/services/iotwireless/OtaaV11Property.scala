package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
