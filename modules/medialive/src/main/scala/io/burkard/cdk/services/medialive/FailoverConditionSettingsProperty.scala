package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FailoverConditionSettingsProperty {

  def apply(
    videoBlackSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty] = None,
    audioSilenceSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty] = None,
    inputLossSettings: Option[software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.FailoverConditionSettingsProperty.Builder)
      .videoBlackSettings(videoBlackSettings.orNull)
      .audioSilenceSettings(audioSilenceSettings.orNull)
      .inputLossSettings(inputLossSettings.orNull)
      .build()
}
