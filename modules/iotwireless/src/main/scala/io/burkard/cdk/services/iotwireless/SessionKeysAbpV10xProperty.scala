package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SessionKeysAbpV10xProperty {

  def apply(
    appSKey: String,
    nwkSKey: String
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty.Builder)
      .appSKey(appSKey)
      .nwkSKey(nwkSKey)
      .build()
}
