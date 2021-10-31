package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMatchmakingRuleSet {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    ruleSetBody: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet =
    software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .ruleSetBody(ruleSetBody.orNull)
      .build()
}
