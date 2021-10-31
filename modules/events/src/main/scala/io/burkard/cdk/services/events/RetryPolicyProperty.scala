package io.burkard.cdk.services.events

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RetryPolicyProperty {

  def apply(
    maximumEventAgeInSeconds: Option[Number] = None,
    maximumRetryAttempts: Option[Number] = None
  ): software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty =
    (new software.amazon.awscdk.services.events.CfnRule.RetryPolicyProperty.Builder)
      .maximumEventAgeInSeconds(maximumEventAgeInSeconds.orNull)
      .maximumRetryAttempts(maximumRetryAttempts.orNull)
      .build()
}
