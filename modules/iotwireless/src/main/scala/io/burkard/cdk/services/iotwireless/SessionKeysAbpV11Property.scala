package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SessionKeysAbpV11Property {

  def apply(
    appSKey: String,
    fNwkSIntKey: String,
    sNwkSIntKey: String,
    nwkSEncKey: String
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property.Builder)
      .appSKey(appSKey)
      .fNwkSIntKey(fNwkSIntKey)
      .sNwkSIntKey(sNwkSIntKey)
      .nwkSEncKey(nwkSEncKey)
      .build()
}
