package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object JsonBodyProperty {

  def apply(
    invalidFallbackBehavior: Option[String] = None,
    matchPattern: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonMatchPatternProperty] = None,
    matchScope: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty.Builder)
      .invalidFallbackBehavior(invalidFallbackBehavior.orNull)
      .matchPattern(matchPattern.orNull)
      .matchScope(matchScope.orNull)
      .build()
}
