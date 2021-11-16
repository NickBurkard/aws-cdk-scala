package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ScheduledTriggerPropertiesProperty {

  def apply(
    scheduleExpression: String,
    timezone: Option[String] = None,
    scheduleOffset: Option[Number] = None,
    firstExecutionFrom: Option[Number] = None,
    scheduleEndTime: Option[Number] = None,
    dataPullMode: Option[String] = None,
    scheduleStartTime: Option[Number] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.ScheduledTriggerPropertiesProperty.Builder)
      .scheduleExpression(scheduleExpression)
      .timezone(timezone.orNull)
      .scheduleOffset(scheduleOffset.orNull)
      .firstExecutionFrom(firstExecutionFrom.orNull)
      .scheduleEndTime(scheduleEndTime.orNull)
      .dataPullMode(dataPullMode.orNull)
      .scheduleStartTime(scheduleStartTime.orNull)
      .build()
}
