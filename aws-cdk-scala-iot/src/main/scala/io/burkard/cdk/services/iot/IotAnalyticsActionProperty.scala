package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IotAnalyticsActionProperty {

  def apply(
    channelName: Option[String] = None,
    roleArn: Option[String] = None,
    batchMode: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.Builder)
      .channelName(channelName.orNull)
      .roleArn(roleArn.orNull)
      .batchMode(batchMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
