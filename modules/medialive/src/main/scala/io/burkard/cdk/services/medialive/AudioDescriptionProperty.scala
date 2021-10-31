package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AudioDescriptionProperty {

  def apply(
    audioTypeControl: Option[String] = None,
    codecSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.AudioCodecSettingsProperty] = None,
    languageCode: Option[String] = None,
    audioNormalizationSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.AudioNormalizationSettingsProperty] = None,
    audioSelectorName: Option[String] = None,
    languageCodeControl: Option[String] = None,
    audioType: Option[String] = None,
    streamName: Option[String] = None,
    name: Option[String] = None,
    remixSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.RemixSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AudioDescriptionProperty.Builder)
      .audioTypeControl(audioTypeControl.orNull)
      .codecSettings(codecSettings.orNull)
      .languageCode(languageCode.orNull)
      .audioNormalizationSettings(audioNormalizationSettings.orNull)
      .audioSelectorName(audioSelectorName.orNull)
      .languageCodeControl(languageCodeControl.orNull)
      .audioType(audioType.orNull)
      .streamName(streamName.orNull)
      .name(name.orNull)
      .remixSettings(remixSettings.orNull)
      .build()
}
