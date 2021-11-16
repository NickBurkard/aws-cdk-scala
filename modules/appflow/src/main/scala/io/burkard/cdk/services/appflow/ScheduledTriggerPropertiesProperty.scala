package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledTriggerPropertiesProperty {

  def apply(
    scheduleExpression: String,
    scheduleOffset: Option[Number] = None,
    scheduleEndTime: Option[Number] = None,
    timeZone: Option[String] = None,
    dataPullMode: Option[String] = None,
    scheduleStartTime: Option[Number] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty.Builder)
      .scheduleExpression(scheduleExpression)
      .scheduleOffset(scheduleOffset.orNull)
      .scheduleEndTime(scheduleEndTime.orNull)
      .timeZone(timeZone.orNull)
      .dataPullMode(dataPullMode.orNull)
      .scheduleStartTime(scheduleStartTime.orNull)
      .build()
}
