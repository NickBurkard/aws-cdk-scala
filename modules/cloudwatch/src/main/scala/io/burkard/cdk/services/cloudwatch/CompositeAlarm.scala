package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CompositeAlarm {

  def apply(
    internalResourceId: String,
    actionsEnabled: Option[Boolean] = None,
    alarmRule: Option[software.amazon.awscdk.services.cloudwatch.IAlarmRule] = None,
    compositeAlarmName: Option[String] = None,
    alarmDescription: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudwatch.CompositeAlarm =
    software.amazon.awscdk.services.cloudwatch.CompositeAlarm.Builder
      .create(stackCtx, internalResourceId)
      .actionsEnabled(actionsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .alarmRule(alarmRule.orNull)
      .compositeAlarmName(compositeAlarmName.orNull)
      .alarmDescription(alarmDescription.orNull)
      .build()
}
