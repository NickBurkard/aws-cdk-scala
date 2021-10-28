package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RateBasedStatementProperty {

  def apply(
    scopeDownStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty] = None,
    aggregateKeyType: Option[String] = None,
    forwardedIpConfig: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty] = None,
    limit: Option[Number] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty.Builder)
      .scopeDownStatement(scopeDownStatement.orNull)
      .aggregateKeyType(aggregateKeyType.orNull)
      .forwardedIpConfig(forwardedIpConfig.orNull)
      .limit(limit.orNull)
      .build()
}
