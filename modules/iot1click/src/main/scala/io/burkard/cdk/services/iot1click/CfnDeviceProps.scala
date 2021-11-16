package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDeviceProps {

  def apply(
    enabled: Boolean,
    deviceId: String
  ): software.amazon.awscdk.services.iot1click.CfnDeviceProps =
    (new software.amazon.awscdk.services.iot1click.CfnDeviceProps.Builder)
      .enabled(enabled)
      .deviceId(deviceId)
      .build()
}
