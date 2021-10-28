package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VideoSelectorColorSpaceSettingsProperty {

  def apply(
    hdr10Settings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Hdr10SettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.VideoSelectorColorSpaceSettingsProperty.Builder)
      .hdr10Settings(hdr10Settings.orNull)
      .build()
}
