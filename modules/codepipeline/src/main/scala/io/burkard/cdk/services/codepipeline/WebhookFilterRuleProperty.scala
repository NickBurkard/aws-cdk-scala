package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WebhookFilterRuleProperty {

  def apply(
    jsonPath: Option[String] = None,
    matchEquals: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty.Builder)
      .jsonPath(jsonPath.orNull)
      .matchEquals(matchEquals.orNull)
      .build()
}
