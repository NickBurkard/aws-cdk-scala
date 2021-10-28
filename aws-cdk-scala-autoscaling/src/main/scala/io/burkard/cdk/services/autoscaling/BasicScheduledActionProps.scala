package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BasicScheduledActionProps {

  def apply(
    maxCapacity: Option[Number] = None,
    startTime: Option[java.time.Instant] = None,
    endTime: Option[java.time.Instant] = None,
    minCapacity: Option[Number] = None,
    desiredCapacity: Option[Number] = None,
    schedule: Option[software.amazon.awscdk.services.autoscaling.Schedule] = None
  ): software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps =
    (new software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder)
      .maxCapacity(maxCapacity.orNull)
      .startTime(startTime.orNull)
      .endTime(endTime.orNull)
      .minCapacity(minCapacity.orNull)
      .desiredCapacity(desiredCapacity.orNull)
      .schedule(schedule.orNull)
      .build()
}
