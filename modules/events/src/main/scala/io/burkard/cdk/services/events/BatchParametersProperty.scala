package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BatchParametersProperty {

  def apply(
    jobDefinition: String,
    jobName: String,
    arrayProperties: Option[software.amazon.awscdk.services.events.CfnRule.BatchArrayPropertiesProperty] = None,
    retryStrategy: Option[software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty] = None
  ): software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty =
    (new software.amazon.awscdk.services.events.CfnRule.BatchParametersProperty.Builder)
      .jobDefinition(jobDefinition)
      .jobName(jobName)
      .arrayProperties(arrayProperties.orNull)
      .retryStrategy(retryStrategy.orNull)
      .build()
}
