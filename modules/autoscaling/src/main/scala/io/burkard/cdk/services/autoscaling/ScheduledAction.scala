package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledAction {

  def apply(
    internalResourceId: String,
    autoScalingGroup: software.amazon.awscdk.services.autoscaling.IAutoScalingGroup,
    maxCapacity: Option[Number] = None,
    startTime: Option[java.time.Instant] = None,
    endTime: Option[java.time.Instant] = None,
    minCapacity: Option[Number] = None,
    timeZone: Option[String] = None,
    desiredCapacity: Option[Number] = None,
    schedule: Option[software.amazon.awscdk.services.autoscaling.Schedule] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.ScheduledAction =
    software.amazon.awscdk.services.autoscaling.ScheduledAction.Builder
      .create(stackCtx, internalResourceId)
      .autoScalingGroup(autoScalingGroup)
      .maxCapacity(maxCapacity.orNull)
      .startTime(startTime.orNull)
      .endTime(endTime.orNull)
      .minCapacity(minCapacity.orNull)
      .timeZone(timeZone.orNull)
      .desiredCapacity(desiredCapacity.orNull)
      .schedule(schedule.orNull)
      .build()
}
