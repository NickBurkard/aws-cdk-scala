package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CloudwatchLogsActionProperty {

  def apply(
    roleArn: Option[String] = None,
    logGroupName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.CloudwatchLogsActionProperty.Builder)
      .roleArn(roleArn.orNull)
      .logGroupName(logGroupName.orNull)
      .build()
}
