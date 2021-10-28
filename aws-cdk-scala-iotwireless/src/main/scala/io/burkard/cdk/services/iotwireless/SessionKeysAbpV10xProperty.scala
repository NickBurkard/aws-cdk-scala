package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SessionKeysAbpV10xProperty {

  def apply(
    appSKey: Option[String] = None,
    nwkSKey: Option[String] = None
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty.Builder)
      .appSKey(appSKey.orNull)
      .nwkSKey(nwkSKey.orNull)
      .build()
}
