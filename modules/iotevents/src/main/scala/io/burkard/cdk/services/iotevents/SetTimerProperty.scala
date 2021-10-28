package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SetTimerProperty {

  def apply(
    durationExpression: Option[String] = None,
    seconds: Option[Number] = None,
    timerName: Option[String] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty.Builder)
      .durationExpression(durationExpression.orNull)
      .seconds(seconds.orNull)
      .timerName(timerName.orNull)
      .build()
}
