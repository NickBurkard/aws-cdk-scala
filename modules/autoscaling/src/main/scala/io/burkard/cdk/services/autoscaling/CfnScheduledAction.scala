package io.burkard.cdk.services.autoscaling

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnScheduledAction {

  def apply(
    internalResourceId: String,
    autoScalingGroupName: String,
    startTime: Option[String] = None,
    recurrence: Option[String] = None,
    endTime: Option[String] = None,
    desiredCapacity: Option[Number] = None,
    maxSize: Option[Number] = None,
    timeZone: Option[String] = None,
    minSize: Option[Number] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.autoscaling.CfnScheduledAction =
    software.amazon.awscdk.services.autoscaling.CfnScheduledAction.Builder
      .create(stackCtx, internalResourceId)
      .autoScalingGroupName(autoScalingGroupName)
      .startTime(startTime.orNull)
      .recurrence(recurrence.orNull)
      .endTime(endTime.orNull)
      .desiredCapacity(desiredCapacity.orNull)
      .maxSize(maxSize.orNull)
      .timeZone(timeZone.orNull)
      .minSize(minSize.orNull)
      .build()
}
