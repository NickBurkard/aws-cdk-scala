package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnScheduledActionProps {

  def apply(
    startTime: Option[String] = None,
    recurrence: Option[String] = None,
    endTime: Option[String] = None,
    desiredCapacity: Option[Number] = None,
    maxSize: Option[Number] = None,
    autoScalingGroupName: Option[String] = None,
    timeZone: Option[String] = None,
    minSize: Option[Number] = None
  ): software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps =
    (new software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder)
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
