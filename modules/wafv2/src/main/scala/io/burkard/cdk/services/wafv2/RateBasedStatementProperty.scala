package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RateBasedStatementProperty {

  def apply(
    aggregateKeyType: String,
    limit: Number,
    scopeDownStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty] = None,
    forwardedIpConfig: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty.Builder)
      .aggregateKeyType(aggregateKeyType)
      .limit(limit)
      .scopeDownStatement(scopeDownStatement.orNull)
      .forwardedIpConfig(forwardedIpConfig.orNull)
      .build()
}
