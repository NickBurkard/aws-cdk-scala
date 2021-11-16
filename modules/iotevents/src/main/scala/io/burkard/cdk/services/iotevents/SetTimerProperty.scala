package io.burkard.cdk.services.iotevents

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SetTimerProperty {

  def apply(
    timerName: String,
    durationExpression: Option[String] = None,
    seconds: Option[Number] = None
  ): software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty =
    (new software.amazon.awscdk.services.iotevents.CfnDetectorModel.SetTimerProperty.Builder)
      .timerName(timerName)
      .durationExpression(durationExpression.orNull)
      .seconds(seconds.orNull)
      .build()
}
