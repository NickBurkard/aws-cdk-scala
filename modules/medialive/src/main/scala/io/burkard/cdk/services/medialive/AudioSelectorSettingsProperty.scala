package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AudioSelectorSettingsProperty {

  def apply(
    audioTrackSelection: Option[software.amazon.awscdk.services.medialive.CfnChannel.AudioTrackSelectionProperty] = None,
    audioPidSelection: Option[software.amazon.awscdk.services.medialive.CfnChannel.AudioPidSelectionProperty] = None,
    audioLanguageSelection: Option[software.amazon.awscdk.services.medialive.CfnChannel.AudioLanguageSelectionProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AudioSelectorSettingsProperty.Builder)
      .audioTrackSelection(audioTrackSelection.orNull)
      .audioPidSelection(audioPidSelection.orNull)
      .audioLanguageSelection(audioLanguageSelection.orNull)
      .build()
}
