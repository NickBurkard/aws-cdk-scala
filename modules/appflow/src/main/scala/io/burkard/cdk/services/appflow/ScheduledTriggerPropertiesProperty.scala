package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScheduledTriggerPropertiesProperty {

  def apply(
    scheduleOffset: Option[Number] = None,
    scheduleExpression: Option[String] = None,
    scheduleEndTime: Option[Number] = None,
    timeZone: Option[String] = None,
    dataPullMode: Option[String] = None,
    scheduleStartTime: Option[Number] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.ScheduledTriggerPropertiesProperty.Builder)
      .scheduleOffset(scheduleOffset.orNull)
      .scheduleExpression(scheduleExpression.orNull)
      .scheduleEndTime(scheduleEndTime.orNull)
      .timeZone(timeZone.orNull)
      .dataPullMode(dataPullMode.orNull)
      .scheduleStartTime(scheduleStartTime.orNull)
      .build()
}
