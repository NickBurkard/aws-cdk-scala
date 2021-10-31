package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InputLossFailoverSettingsProperty {

  def apply(
    inputLossThresholdMsec: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty.Builder)
      .inputLossThresholdMsec(inputLossThresholdMsec.orNull)
      .build()
}
