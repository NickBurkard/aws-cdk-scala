package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTopicRuleDestinationProps {

  def apply(
    httpUrlProperties: Option[software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty] = None,
    vpcProperties: Option[software.amazon.awscdk.services.iot.CfnTopicRuleDestination.VpcDestinationPropertiesProperty] = None,
    status: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps =
    (new software.amazon.awscdk.services.iot.CfnTopicRuleDestinationProps.Builder)
      .httpUrlProperties(httpUrlProperties.orNull)
      .vpcProperties(vpcProperties.orNull)
      .status(status.orNull)
      .build()
}
