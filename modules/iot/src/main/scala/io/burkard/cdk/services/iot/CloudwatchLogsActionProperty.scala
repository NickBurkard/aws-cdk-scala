package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CloudwatchLogsActionProperty {

  def apply(
    roleArn: String,
    logGroupName: String
  ): software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty.Builder)
      .roleArn(roleArn)
      .logGroupName(logGroupName)
      .build()
}
