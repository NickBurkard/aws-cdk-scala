package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResetTimerProperty {

  def apply(
    timerName: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.ResetTimerProperty.Builder)
      .timerName(timerName.orNull)
      .build()
}
