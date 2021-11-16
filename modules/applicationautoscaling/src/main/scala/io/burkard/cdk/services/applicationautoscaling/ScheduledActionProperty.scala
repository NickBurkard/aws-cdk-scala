package io.burkard.cdk.services.applicationautoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledActionProperty {

  def apply(
    scheduledActionName: String,
    schedule: String,
    startTime: Option[java.time.Instant] = None,
    timezone: Option[String] = None,
    scalableTargetAction: Option[software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty] = None,
    endTime: Option[java.time.Instant] = None
  ): software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty =
    (new software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder)
      .scheduledActionName(scheduledActionName)
      .schedule(schedule)
      .startTime(startTime.orNull)
      .timezone(timezone.orNull)
      .scalableTargetAction(scalableTargetAction.orNull)
      .endTime(endTime.orNull)
      .build()
}
