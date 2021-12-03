package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotStatementProperty {

  def apply(
    statement: software.amazon.awscdk.services.wafv2.CfnRuleGroup.StatementProperty
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.NotStatementProperty.Builder)
      .statement(statement)
      .build()
}
