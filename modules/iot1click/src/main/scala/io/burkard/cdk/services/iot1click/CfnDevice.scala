package io.burkard.cdk.services.iot1click

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDevice {

  def apply(
    internalResourceId: String,
    enabled: Option[Boolean] = None,
    deviceId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot1click.CfnDevice =
    software.amazon.awscdk.services.iot1click.CfnDevice.Builder
      .create(stackCtx, internalResourceId)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deviceId(deviceId.orNull)
      .build()
}
