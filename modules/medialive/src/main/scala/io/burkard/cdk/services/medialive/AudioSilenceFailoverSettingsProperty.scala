package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AudioSilenceFailoverSettingsProperty {

  def apply(
    audioSilenceThresholdMsec: Option[Number] = None,
    audioSelectorName: Option[String] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.AudioSilenceFailoverSettingsProperty.Builder)
      .audioSilenceThresholdMsec(audioSilenceThresholdMsec.orNull)
      .audioSelectorName(audioSelectorName.orNull)
      .build()
}
