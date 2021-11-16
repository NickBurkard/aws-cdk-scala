package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WebhookFilterRuleProperty {

  def apply(
    jsonPath: String,
    matchEquals: Option[String] = None
  ): software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty =
    (new software.amazon.awscdk.services.codepipeline.CfnWebhook.WebhookFilterRuleProperty.Builder)
      .jsonPath(jsonPath)
      .matchEquals(matchEquals.orNull)
      .build()
}
