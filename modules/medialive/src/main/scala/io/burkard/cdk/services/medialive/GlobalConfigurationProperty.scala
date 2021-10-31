package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GlobalConfigurationProperty {

  def apply(
    outputLockingMode: Option[String] = None,
    supportLowFramerateInputs: Option[String] = None,
    inputLossBehavior: Option[software.amazon.awscdk.services.medialive.CfnChannel.InputLossBehaviorProperty] = None,
    inputEndAction: Option[String] = None,
    outputTimingSource: Option[String] = None,
    initialAudioGain: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.GlobalConfigurationProperty.Builder)
      .outputLockingMode(outputLockingMode.orNull)
      .supportLowFramerateInputs(supportLowFramerateInputs.orNull)
      .inputLossBehavior(inputLossBehavior.orNull)
      .inputEndAction(inputEndAction.orNull)
      .outputTimingSource(outputTimingSource.orNull)
      .initialAudioGain(initialAudioGain.orNull)
      .build()
}
