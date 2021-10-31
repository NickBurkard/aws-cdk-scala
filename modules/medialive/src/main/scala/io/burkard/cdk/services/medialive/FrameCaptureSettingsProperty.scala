package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FrameCaptureSettingsProperty {

  def apply(
    captureInterval: Option[Number] = None,
    captureIntervalUnits: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty.Builder)
      .captureInterval(captureInterval.orNull)
      .captureIntervalUnits(captureIntervalUnits.orNull)
      .build()
}
