package io.burkard.cdk.services.redshift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnScheduledActionProps {

  def apply(
    scheduledActionName: String,
    enable: Option[Boolean] = None,
    scheduledActionDescription: Option[String] = None,
    startTime: Option[String] = None,
    iamRole: Option[String] = None,
    endTime: Option[String] = None,
    targetAction: Option[software.amazon.awscdk.services.redshift.CfnScheduledAction.ScheduledActionTypeProperty] = None,
    schedule: Option[String] = None
  ): software.amazon.awscdk.services.redshift.CfnScheduledActionProps =
    (new software.amazon.awscdk.services.redshift.CfnScheduledActionProps.Builder)
      .scheduledActionName(scheduledActionName)
      .enable(enable.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .scheduledActionDescription(scheduledActionDescription.orNull)
      .startTime(startTime.orNull)
      .iamRole(iamRole.orNull)
      .endTime(endTime.orNull)
      .targetAction(targetAction.orNull)
      .schedule(schedule.orNull)
      .build()
}
