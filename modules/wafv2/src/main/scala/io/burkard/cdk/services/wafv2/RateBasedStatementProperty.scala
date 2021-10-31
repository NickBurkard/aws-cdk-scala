package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RateBasedStatementProperty {

  def apply(
    scopeDownStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty] = None,
    aggregateKeyType: Option[String] = None,
    forwardedIpConfig: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty] = None,
    limit: Option[Number] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty.Builder)
      .scopeDownStatement(scopeDownStatement.orNull)
      .aggregateKeyType(aggregateKeyType.orNull)
      .forwardedIpConfig(forwardedIpConfig.orNull)
      .limit(limit.orNull)
      .build()
}
