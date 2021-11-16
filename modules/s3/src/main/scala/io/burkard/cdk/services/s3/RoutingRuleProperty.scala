package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RoutingRuleProperty {

  def apply(
    redirectRule: software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty,
    routingRuleCondition: Option[software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.Builder)
      .redirectRule(redirectRule)
      .routingRuleCondition(routingRuleCondition.orNull)
      .build()
}
