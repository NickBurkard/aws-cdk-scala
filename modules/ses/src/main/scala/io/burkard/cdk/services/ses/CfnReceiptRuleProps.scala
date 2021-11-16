package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReceiptRuleProps {

  def apply(
    ruleSetName: String,
    rule: software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty,
    after: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRuleProps =
    (new software.amazon.awscdk.services.ses.CfnReceiptRuleProps.Builder)
      .ruleSetName(ruleSetName)
      .rule(rule)
      .after(after.orNull)
      .build()
}
