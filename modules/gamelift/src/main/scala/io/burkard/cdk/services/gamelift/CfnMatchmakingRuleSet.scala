package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMatchmakingRuleSet {

  def apply(
    internalResourceId: String,
    name: String,
    ruleSetBody: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet =
    software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .ruleSetBody(ruleSetBody)
      .build()
}
