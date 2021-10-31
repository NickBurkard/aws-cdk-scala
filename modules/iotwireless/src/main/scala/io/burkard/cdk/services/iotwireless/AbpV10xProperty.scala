package io.burkard.cdk.services.iotwireless

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AbpV10xProperty {

  def apply(
    sessionKeys: Option[software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.SessionKeysAbpV10xProperty] = None,
    devAddr: Option[String] = None
  ): software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty =
    (new software.amazon.awscdk.services.iotwireless.CfnWirelessDevice.AbpV10xProperty.Builder)
      .sessionKeys(sessionKeys.orNull)
      .devAddr(devAddr.orNull)
      .build()
}
