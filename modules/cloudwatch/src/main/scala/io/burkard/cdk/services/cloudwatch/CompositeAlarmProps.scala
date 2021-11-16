package io.burkard.cdk.services.cloudwatch

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CompositeAlarmProps {

  def apply(
    alarmRule: software.amazon.awscdk.services.cloudwatch.IAlarmRule,
    actionsEnabled: Option[Boolean] = None,
    compositeAlarmName: Option[String] = None,
    alarmDescription: Option[String] = None
  ): software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps =
    (new software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps.Builder)
      .alarmRule(alarmRule)
      .actionsEnabled(actionsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .compositeAlarmName(compositeAlarmName.orNull)
      .alarmDescription(alarmDescription.orNull)
      .build()
}
