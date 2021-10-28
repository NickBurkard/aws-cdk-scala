package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScheduledActionProperty {

  def apply(
    startTime: Option[java.time.Instant] = None,
    timezone: Option[String] = None,
    scalableTargetAction: Option[software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty] = None,
    endTime: Option[java.time.Instant] = None,
    scheduledActionName: Option[String] = None,
    schedule: Option[String] = None
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder)
      .startTime(startTime.orNull)
      .timezone(timezone.orNull)
      .scalableTargetAction(scalableTargetAction.orNull)
      .endTime(endTime.orNull)
      .scheduledActionName(scheduledActionName.orNull)
      .schedule(schedule.orNull)
      .build()
}
