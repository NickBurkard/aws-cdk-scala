package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CompositeAlarmProps {

  def apply(
    actionsEnabled: Option[Boolean] = None,
    alarmRule: Option[software.amazon.awscdk.services.cloudwatch.IAlarmRule] = None,
    compositeAlarmName: Option[String] = None,
    alarmDescription: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps =
    (new software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps.Builder)
      .actionsEnabled(actionsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .alarmRule(alarmRule.orNull)
      .compositeAlarmName(compositeAlarmName.orNull)
      .alarmDescription(alarmDescription.orNull)
      .build()
}
