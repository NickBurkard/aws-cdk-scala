package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledActionProps {

  def apply(
    maxCapacity: Option[Number] = None,
    startTime: Option[java.time.Instant] = None,
    autoScalingGroup: Option[software.amazon.awscdk.services.autoscaling.IAutoScalingGroup] = None,
    endTime: Option[java.time.Instant] = None,
    minCapacity: Option[Number] = None,
    desiredCapacity: Option[Number] = None,
    schedule: Option[software.amazon.awscdk.services.autoscaling.Schedule] = None
  ): software.amazon.awscdk.services.autoscaling.ScheduledActionProps =
    (new software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder)
      .maxCapacity(maxCapacity.orNull)
      .startTime(startTime.orNull)
      .autoScalingGroup(autoScalingGroup.orNull)
      .endTime(endTime.orNull)
      .minCapacity(minCapacity.orNull)
      .desiredCapacity(desiredCapacity.orNull)
      .schedule(schedule.orNull)
      .build()
}
