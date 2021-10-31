package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CaptionDestinationSettingsProperty {

  def apply(
    dvbSubDestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.DvbSubDestinationSettingsProperty] = None,
    teletextDestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.TeletextDestinationSettingsProperty] = None,
    burnInDestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.BurnInDestinationSettingsProperty] = None,
    aribDestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.AribDestinationSettingsProperty] = None,
    webvttDestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.WebvttDestinationSettingsProperty] = None,
    scte27DestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Scte27DestinationSettingsProperty] = None,
    ebuTtDDestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.EbuTtDDestinationSettingsProperty] = None,
    smpteTtDestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.SmpteTtDestinationSettingsProperty] = None,
    embeddedPlusScte20DestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty] = None,
    ttmlDestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.TtmlDestinationSettingsProperty] = None,
    scte20PlusEmbeddedDestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty] = None,
    rtmpCaptionInfoDestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.RtmpCaptionInfoDestinationSettingsProperty] = None,
    embeddedDestinationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.EmbeddedDestinationSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.CaptionDestinationSettingsProperty.Builder)
      .dvbSubDestinationSettings(dvbSubDestinationSettings.orNull)
      .teletextDestinationSettings(teletextDestinationSettings.orNull)
      .burnInDestinationSettings(burnInDestinationSettings.orNull)
      .aribDestinationSettings(aribDestinationSettings.orNull)
      .webvttDestinationSettings(webvttDestinationSettings.orNull)
      .scte27DestinationSettings(scte27DestinationSettings.orNull)
      .ebuTtDDestinationSettings(ebuTtDDestinationSettings.orNull)
      .smpteTtDestinationSettings(smpteTtDestinationSettings.orNull)
      .embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings.orNull)
      .ttmlDestinationSettings(ttmlDestinationSettings.orNull)
      .scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings.orNull)
      .rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings.orNull)
      .embeddedDestinationSettings(embeddedDestinationSettings.orNull)
      .build()
}
