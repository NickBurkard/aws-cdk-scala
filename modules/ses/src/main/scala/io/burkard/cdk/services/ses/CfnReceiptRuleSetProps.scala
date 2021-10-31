package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReceiptRuleSetProps {

  def apply(
    ruleSetName: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps =
    (new software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps.Builder)
      .ruleSetName(ruleSetName.orNull)
      .build()
}
