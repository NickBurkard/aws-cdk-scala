package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JsonBodyProperty {

  def apply(
    matchPattern: software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty,
    matchScope: String,
    invalidFallbackBehavior: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty.Builder)
      .matchPattern(matchPattern)
      .matchScope(matchScope)
      .invalidFallbackBehavior(invalidFallbackBehavior.orNull)
      .build()
}
