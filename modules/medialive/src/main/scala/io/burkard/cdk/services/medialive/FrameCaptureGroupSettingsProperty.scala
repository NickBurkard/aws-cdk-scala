package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FrameCaptureGroupSettingsProperty {

  def apply(
    frameCaptureCdnSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty] = None,
    destination: Option[software.amazon.awscdk.services.medialive.CfnChannel.OutputLocationRefProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureGroupSettingsProperty.Builder)
      .frameCaptureCdnSettings(frameCaptureCdnSettings.orNull)
      .destination(destination.orNull)
      .build()
}
