package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object H264ColorSpaceSettingsProperty {

  def apply(
    rec601Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Rec601SettingsProperty] = None,
    colorSpacePassthroughSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.ColorSpacePassthroughSettingsProperty] = None,
    rec709Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Rec709SettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.H264ColorSpaceSettingsProperty.Builder)
      .rec601Settings(rec601Settings.orNull)
      .colorSpacePassthroughSettings(colorSpacePassthroughSettings.orNull)
      .rec709Settings(rec709Settings.orNull)
      .build()
}
