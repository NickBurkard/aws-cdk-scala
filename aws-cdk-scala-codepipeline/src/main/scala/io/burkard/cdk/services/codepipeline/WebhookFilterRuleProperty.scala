package io.burkard.cdk.services.codepipeline

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
