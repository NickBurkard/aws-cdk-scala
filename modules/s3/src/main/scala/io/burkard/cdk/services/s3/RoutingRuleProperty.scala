package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RoutingRuleProperty {

  def apply(
    redirectRule: Option[software.amazon.awscdk.services.s3.CfnBucket.RedirectRuleProperty] = None,
    routingRuleCondition: Option[software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleConditionProperty] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.RoutingRuleProperty.Builder)
      .redirectRule(redirectRule.orNull)
      .routingRuleCondition(routingRuleCondition.orNull)
      .build()
}
