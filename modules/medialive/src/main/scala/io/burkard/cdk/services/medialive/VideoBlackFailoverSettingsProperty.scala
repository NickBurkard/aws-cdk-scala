package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VideoBlackFailoverSettingsProperty {

  def apply(
    videoBlackThresholdMsec: Option[Number] = None,
    blackDetectThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.VideoBlackFailoverSettingsProperty.Builder)
      .videoBlackThresholdMsec(videoBlackThresholdMsec.orNull)
      .blackDetectThreshold(blackDetectThreshold.orNull)
      .build()
}
