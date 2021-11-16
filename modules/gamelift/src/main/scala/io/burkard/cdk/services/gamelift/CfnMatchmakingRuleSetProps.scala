package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMatchmakingRuleSetProps {

  def apply(
    name: String,
    ruleSetBody: String
  ): software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps =
    (new software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps.Builder)
      .name(name)
      .ruleSetBody(ruleSetBody)
      .build()
}
