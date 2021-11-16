package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OtaaV11Property {

  def apply(
    appKey: String,
    nwkKey: String,
    joinEui: String
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV11Property.Builder)
      .appKey(appKey)
      .nwkKey(nwkKey)
      .joinEui(joinEui)
      .build()
}
