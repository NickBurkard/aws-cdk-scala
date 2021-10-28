package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTopicRuleDestination {

  def apply(
    internalResourceId: String,
    httpUrlProperties: Option[software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty] = None,
    vpcProperties: Option[software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty] = None,
    status: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnTopicRuleDestination =
    software.amazon.awscdk.services.iot.CfnTopicRuleDestination.Builder
      .create(stackCtx, internalResourceId)
      .httpUrlProperties(httpUrlProperties.orNull)
      .vpcProperties(vpcProperties.orNull)
      .status(status.orNull)
      .build()
}
