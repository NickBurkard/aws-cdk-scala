package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScheduledAction {

  def apply(
    internalResourceId: String,
    maxCapacity: Option[Number] = None,
    startTime: Option[java.time.Instant] = None,
    autoScalingGroup: Option[software.amazon.awscdk.services.autoscaling.IAutoScalingGroup] = None,
    endTime: Option[java.time.Instant] = None,
    minCapacity: Option[Number] = None,
    desiredCapacity: Option[Number] = None,
    schedule: Option[software.amazon.awscdk.services.autoscaling.Schedule] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.ScheduledAction =
    software.amazon.awscdk.services.autoscaling.ScheduledAction.Builder
      .create(stackCtx, internalResourceId)
      .maxCapacity(maxCapacity.orNull)
      .startTime(startTime.orNull)
      .autoScalingGroup(autoScalingGroup.orNull)
      .endTime(endTime.orNull)
      .minCapacity(minCapacity.orNull)
      .desiredCapacity(desiredCapacity.orNull)
      .schedule(schedule.orNull)
      .build()
}
