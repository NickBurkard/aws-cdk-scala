package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AbpV11Property {

  def apply(
    sessionKeys: Option[software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property] = None,
    devAddr: Option[String] = None
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property.Builder)
      .sessionKeys(sessionKeys.orNull)
      .devAddr(devAddr.orNull)
      .build()
}
