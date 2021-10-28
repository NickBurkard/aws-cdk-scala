package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BatchParametersProperty {

  def apply(
    arrayProperties: Option[software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty] = None,
    retryStrategy: Option[software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty] = None,
    jobDefinition: Option[String] = None,
    jobName: Option[String] = None
  ): software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty =
    (new software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty.Builder)
      .arrayProperties(arrayProperties.orNull)
      .retryStrategy(retryStrategy.orNull)
      .jobDefinition(jobDefinition.orNull)
      .jobName(jobName.orNull)
      .build()
}
