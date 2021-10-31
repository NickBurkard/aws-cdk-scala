package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HttpUrlDestinationSummaryProperty {

  def apply(
    confirmationUrl: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty =
    (new software.amazon.awscdk.services.iot.CfnTopicRuleDestination.HttpUrlDestinationSummaryProperty.Builder)
      .confirmationUrl(confirmationUrl.orNull)
      .build()
}
