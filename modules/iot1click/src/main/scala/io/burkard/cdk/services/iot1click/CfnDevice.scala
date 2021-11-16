package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDevice {

  def apply(
    internalResourceId: String,
    enabled: Boolean,
    deviceId: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot1click.CfnDevice =
    software.amazon.awscdk.services.iot1click.CfnDevice.Builder
      .create(stackCtx, internalResourceId)
      .enabled(enabled)
      .deviceId(deviceId)
      .build()
}
