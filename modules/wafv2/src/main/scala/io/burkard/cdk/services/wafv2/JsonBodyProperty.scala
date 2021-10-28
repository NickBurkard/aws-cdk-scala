package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object JsonBodyProperty {

  def apply(
    invalidFallbackBehavior: Option[String] = None,
    matchPattern: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.JsonMatchPatternProperty] = None,
    matchScope: Option[String] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.JsonBodyProperty.Builder)
      .invalidFallbackBehavior(invalidFallbackBehavior.orNull)
      .matchPattern(matchPattern.orNull)
      .matchScope(matchScope.orNull)
      .build()
}
