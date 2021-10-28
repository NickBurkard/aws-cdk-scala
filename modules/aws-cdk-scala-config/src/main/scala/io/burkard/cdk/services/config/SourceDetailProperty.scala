package io.burkard.cdk.services.config

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SourceDetailProperty {

  def apply(
    eventSource: Option[String] = None,
    messageType: Option[String] = None,
    maximumExecutionFrequency: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty =
    (new software.amazon.awscdk.services.config.CfnConfigRule.SourceDetailProperty.Builder)
      .eventSource(eventSource.orNull)
      .messageType(messageType.orNull)
      .maximumExecutionFrequency(maximumExecutionFrequency.orNull)
      .build()
}
