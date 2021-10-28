package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CaptionSelectorSettingsProperty {

  def apply(
    aribSourceSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.AribSourceSettingsProperty] = None,
    scte20SourceSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Scte20SourceSettingsProperty] = None,
    teletextSourceSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.TeletextSourceSettingsProperty] = None,
    embeddedSourceSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedSourceSettingsProperty] = None,
    dvbSubSourceSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.DvbSubSourceSettingsProperty] = None,
    ancillarySourceSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.AncillarySourceSettingsProperty] = None,
    scte27SourceSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Scte27SourceSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.CaptionSelectorSettingsProperty.Builder)
      .aribSourceSettings(aribSourceSettings.orNull)
      .scte20SourceSettings(scte20SourceSettings.orNull)
      .teletextSourceSettings(teletextSourceSettings.orNull)
      .embeddedSourceSettings(embeddedSourceSettings.orNull)
      .dvbSubSourceSettings(dvbSubSourceSettings.orNull)
      .ancillarySourceSettings(ancillarySourceSettings.orNull)
      .scte27SourceSettings(scte27SourceSettings.orNull)
      .build()
}
