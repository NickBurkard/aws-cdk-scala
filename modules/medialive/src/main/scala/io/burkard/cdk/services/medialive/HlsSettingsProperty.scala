package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HlsSettingsProperty {

  def apply(
    fmp4HlsSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Fmp4HlsSettingsProperty] = None,
    frameCaptureHlsSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.FrameCaptureHlsSettingsProperty] = None,
    standardHlsSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.StandardHlsSettingsProperty] = None,
    audioOnlyHlsSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.AudioOnlyHlsSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.HlsSettingsProperty.Builder)
      .fmp4HlsSettings(fmp4HlsSettings.orNull)
      .frameCaptureHlsSettings(frameCaptureHlsSettings.orNull)
      .standardHlsSettings(standardHlsSettings.orNull)
      .audioOnlyHlsSettings(audioOnlyHlsSettings.orNull)
      .build()
}
