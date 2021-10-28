package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FrameCaptureCdnSettingsProperty {

  def apply(
    frameCaptureS3Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureS3SettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureCdnSettingsProperty.Builder)
      .frameCaptureS3Settings(frameCaptureS3Settings.orNull)
      .build()
}
