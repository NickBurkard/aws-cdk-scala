package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object H265ColorSpaceSettingsProperty {

  def apply(
    rec601Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty] = None,
    colorSpacePassthroughSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.ColorSpacePassthroughSettingsProperty] = None,
    hdr10Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty] = None,
    rec709Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.H265ColorSpaceSettingsProperty.Builder)
      .rec601Settings(rec601Settings.orNull)
      .colorSpacePassthroughSettings(colorSpacePassthroughSettings.orNull)
      .hdr10Settings(hdr10Settings.orNull)
      .rec709Settings(rec709Settings.orNull)
      .build()
}
