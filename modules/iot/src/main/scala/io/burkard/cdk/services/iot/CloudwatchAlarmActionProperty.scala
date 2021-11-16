package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudwatchAlarmActionProperty {

  def apply(
    stateReason: String,
    stateValue: String,
    roleArn: String,
    alarmName: String
  ): software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchAlarmActionProperty.Builder)
      .stateReason(stateReason)
      .stateValue(stateValue)
      .roleArn(roleArn)
      .alarmName(alarmName)
      .build()
}
