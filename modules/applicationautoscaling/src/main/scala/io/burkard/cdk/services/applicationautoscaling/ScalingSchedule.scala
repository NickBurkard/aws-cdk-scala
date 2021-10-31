package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScalingSchedule {

  def apply(
    maxCapacity: Option[Number] = None,
    startTime: Option[java.time.Instant] = None,
    endTime: Option[java.time.Instant] = None,
    minCapacity: Option[Number] = None,
    schedule: Option[software.amazon.awscdk.services.applicationautoscaling.Schedule] = None
  ): software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule =
    (new software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder)
      .maxCapacity(maxCapacity.orNull)
      .startTime(startTime.orNull)
      .endTime(endTime.orNull)
      .minCapacity(minCapacity.orNull)
      .schedule(schedule.orNull)
      .build()
}
