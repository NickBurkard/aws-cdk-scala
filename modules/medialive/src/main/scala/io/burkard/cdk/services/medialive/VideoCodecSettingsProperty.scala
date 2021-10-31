package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VideoCodecSettingsProperty {

  def apply(
    h265Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.H265SettingsProperty] = None,
    h264Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.H264SettingsProperty] = None,
    frameCaptureSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureSettingsProperty] = None,
    mpeg2Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Mpeg2SettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.VideoCodecSettingsProperty.Builder)
      .h265Settings(h265Settings.orNull)
      .h264Settings(h264Settings.orNull)
      .frameCaptureSettings(frameCaptureSettings.orNull)
      .mpeg2Settings(mpeg2Settings.orNull)
      .build()
}
