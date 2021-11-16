package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResetTimerProperty {

  def apply(
    timerName: String
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty.Builder)
      .timerName(timerName)
      .build()
}
