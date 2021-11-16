package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReceiptRule {

  def apply(
    internalResourceId: String,
    ruleSetName: String,
    rule: software.amazon.awscdk.services.ses.CfnReceiptRule.RuleProperty,
    after: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.CfnReceiptRule =
    software.amazon.awscdk.services.ses.CfnReceiptRule.Builder
      .create(stackCtx, internalResourceId)
      .ruleSetName(ruleSetName)
      .rule(rule)
      .after(after.orNull)
      .build()
}
