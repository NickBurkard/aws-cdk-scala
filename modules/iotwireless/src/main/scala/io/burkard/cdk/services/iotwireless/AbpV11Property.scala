package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AbpV11Property {

  def apply(
    sessionKeys: software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV11Property,
    devAddr: String
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV11Property.Builder)
      .sessionKeys(sessionKeys)
      .devAddr(devAddr)
      .build()
}
