package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
