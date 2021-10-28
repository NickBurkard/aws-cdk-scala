package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnScheduledAction {

  def apply(
    internalResourceId: String,
    startTime: Option[String] = None,
    recurrence: Option[String] = None,
    endTime: Option[String] = None,
    desiredCapacity: Option[Number] = None,
    maxSize: Option[Number] = None,
    autoScalingGroupName: Option[String] = None,
    timeZone: Option[String] = None,
    minSize: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.CfnScheduledAction =
    software.amazon.awscdk.services.autoscaling.CfnScheduledAction.Builder
      .create(stackCtx, internalResourceId)
      .startTime(startTime.orNull)
      .recurrence(recurrence.orNull)
      .endTime(endTime.orNull)
      .desiredCapacity(desiredCapacity.orNull)
      .maxSize(maxSize.orNull)
      .autoScalingGroupName(autoScalingGroupName.orNull)
      .timeZone(timeZone.orNull)
      .minSize(minSize.orNull)
      .build()
}
