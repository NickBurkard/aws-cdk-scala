package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMatchmakingRuleSetProps {

  def apply(
    name: Option[String] = None,
    ruleSetBody: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps =
    (new software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSetProps.Builder)
      .name(name.orNull)
      .ruleSetBody(ruleSetBody.orNull)
      .build()
}
