package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OtaaV10xProperty {

  def apply(
    appKey: String,
    appEui: String
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.OtaaV10xProperty.Builder)
      .appKey(appKey)
      .appEui(appEui)
      .build()
}
