package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpUrlDestinationSummaryProperty {

  def apply(
    confirmationUrl: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.Builder)
      .confirmationUrl(confirmationUrl.orNull)
      .build()
}
