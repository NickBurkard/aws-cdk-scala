package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudwatchAlarmActionProperty {

  def apply(
    stateReason: Option[String] = None,
    stateValue: Option[String] = None,
    roleArn: Option[String] = None,
    alarmName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder)
      .stateReason(stateReason.orNull)
      .stateValue(stateValue.orNull)
      .roleArn(roleArn.orNull)
      .alarmName(alarmName.orNull)
      .build()
}
