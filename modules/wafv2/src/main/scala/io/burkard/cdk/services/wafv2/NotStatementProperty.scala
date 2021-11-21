package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NotStatementProperty {

  def apply(
    statement: software.amazon.awscdk.services.wafv2.CfnWebACL.StatementProperty
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.NotStatementProperty.Builder)
      .statement(statement)
      .build()
}
