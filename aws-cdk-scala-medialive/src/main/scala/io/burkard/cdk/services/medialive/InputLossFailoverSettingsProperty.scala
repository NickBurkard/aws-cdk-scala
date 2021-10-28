package io.burkard.cdk.services.medialive

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InputLossFailoverSettingsProperty {

  def apply(
    inputLossThresholdMsec: Option[Number] = None
  ): software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty =
    (new software.amazon.awscdk.services.medialive.CfnChannel.InputLossFailoverSettingsProperty.Builder)
      .inputLossThresholdMsec(inputLossThresholdMsec.orNull)
      .build()
}
