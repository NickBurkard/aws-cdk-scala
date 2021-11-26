package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BasicScheduledActionProps {

  def apply(
    schedule: software.amazon.awscdk.services.autoscaling.Schedule,
    maxCapacity: Option[Number] = None,
    startTime: Option[java.time.Instant] = None,
    endTime: Option[java.time.Instant] = None,
    minCapacity: Option[Number] = None,
    timeZone: Option[String] = None,
    desiredCapacity: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps =
    (new software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder)
      .schedule(schedule)
      .maxCapacity(maxCapacity.orNull)
      .startTime(startTime.orNull)
      .endTime(endTime.orNull)
      .minCapacity(minCapacity.orNull)
      .timeZone(timeZone.orNull)
      .desiredCapacity(desiredCapacity.orNull)
      .build()
}
