package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StatementProperty {

  def apply(
    notStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty] = None,
    regexPatternSetReferenceStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.RegexPatternSetReferenceStatementProperty] = None,
    geoMatchStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty] = None,
    rateBasedStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.RateBasedStatementProperty] = None,
    sqliMatchStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.SqliMatchStatementProperty] = None,
    andStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.AndStatementProperty] = None,
    sizeConstraintStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.SizeConstraintStatementProperty] = None,
    orStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.OrStatementProperty] = None,
    xssMatchStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.XssMatchStatementProperty] = None,
    ipSetReferenceStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.IPSetReferenceStatementProperty] = None,
    labelMatchStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.LabelMatchStatementProperty] = None,
    byteMatchStatement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.ByteMatchStatementProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty.Builder)
      .notStatement(notStatement.orNull)
      .regexPatternSetReferenceStatement(regexPatternSetReferenceStatement.orNull)
      .geoMatchStatement(geoMatchStatement.orNull)
      .rateBasedStatement(rateBasedStatement.orNull)
      .sqliMatchStatement(sqliMatchStatement.orNull)
      .andStatement(andStatement.orNull)
      .sizeConstraintStatement(sizeConstraintStatement.orNull)
      .orStatement(orStatement.orNull)
      .xssMatchStatement(xssMatchStatement.orNull)
      .ipSetReferenceStatement(ipSetReferenceStatement.orNull)
      .labelMatchStatement(labelMatchStatement.orNull)
      .byteMatchStatement(byteMatchStatement.orNull)
      .build()
}
