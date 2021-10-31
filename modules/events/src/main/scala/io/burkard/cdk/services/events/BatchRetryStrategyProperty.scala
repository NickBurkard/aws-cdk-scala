package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BatchRetryStrategyProperty {

  def apply(
    attempts: Option[Number] = None
  ): software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty =
    (new software.amazon.awscdk.services.events.CfnRule.BatchRetryStrategyProperty.Builder)
      .attempts(attempts.orNull)
      .build()
}
