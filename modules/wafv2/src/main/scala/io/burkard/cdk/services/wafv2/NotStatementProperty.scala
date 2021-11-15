package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotStatementProperty {

  def apply(
    statement: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty.Builder)
      .statement(statement.orNull)
      .build()
}
