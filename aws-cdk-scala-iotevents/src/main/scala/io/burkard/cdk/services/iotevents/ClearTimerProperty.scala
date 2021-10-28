package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClearTimerProperty {

  def apply(
    timerName: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.ClearTimerProperty.Builder)
      .timerName(timerName.orNull)
      .build()
}
