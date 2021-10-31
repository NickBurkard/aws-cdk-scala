package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SessionKeysAbpV11Property {

  def apply(
    appSKey: Option[String] = None,
    fNwkSIntKey: Option[String] = None,
    sNwkSIntKey: Option[String] = None,
    nwkSEncKey: Option[String] = None
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property.Builder)
      .appSKey(appSKey.orNull)
      .fNwkSIntKey(fNwkSIntKey.orNull)
      .sNwkSIntKey(sNwkSIntKey.orNull)
      .nwkSEncKey(nwkSEncKey.orNull)
      .build()
}
