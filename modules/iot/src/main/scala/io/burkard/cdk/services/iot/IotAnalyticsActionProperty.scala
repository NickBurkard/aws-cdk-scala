package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IotAnalyticsActionProperty {

  def apply(
    channelName: String,
    roleArn: String,
    batchMode: Option[Boolean] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRule.IotAnalyticsActionProperty.Builder)
      .channelName(channelName)
      .roleArn(roleArn)
      .batchMode(batchMode.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
