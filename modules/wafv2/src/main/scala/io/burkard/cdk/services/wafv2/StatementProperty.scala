package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatementProperty {

  def apply(
    notStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty] = None,
    regexPatternSetReferenceStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.RegexPatternSetReferenceStatementProperty] = None,
    sqliMatchStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.SqliMatchStatementProperty] = None,
    andStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.AndStatementProperty] = None,
    sizeConstraintStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.SizeConstraintStatementProperty] = None,
    orStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.OrStatementProperty] = None,
    xssMatchStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.XssMatchStatementProperty] = None,
    ipSetReferenceStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.IPSetReferenceStatementProperty] = None,
    geoMatchStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty] = None,
    managedRuleGroupStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.ManagedRuleGroupStatementProperty] = None,
    rateBasedStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.RateBasedStatementProperty] = None,
    ruleGroupReferenceStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty] = None,
    labelMatchStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.LabelMatchStatementProperty] = None,
    byteMatchStatement: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.ByteMatchStatementProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty.Builder)
      .notStatement(notStatement.orNull)
      .regexPatternSetReferenceStatement(regexPatternSetReferenceStatement.orNull)
      .sqliMatchStatement(sqliMatchStatement.orNull)
      .andStatement(andStatement.orNull)
      .sizeConstraintStatement(sizeConstraintStatement.orNull)
      .orStatement(orStatement.orNull)
      .xssMatchStatement(xssMatchStatement.orNull)
      .ipSetReferenceStatement(ipSetReferenceStatement.orNull)
      .geoMatchStatement(geoMatchStatement.orNull)
      .managedRuleGroupStatement(managedRuleGroupStatement.orNull)
      .rateBasedStatement(rateBasedStatement.orNull)
      .ruleGroupReferenceStatement(ruleGroupReferenceStatement.orNull)
      .labelMatchStatement(labelMatchStatement.orNull)
      .byteMatchStatement(byteMatchStatement.orNull)
      .build()
}
