package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReceiptRuleSetProps {

  def apply(
    ruleSetName: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps =
    (new software.amazon.awscdk.services.ses.CfnReceiptRuleSetProps.Builder)
      .ruleSetName(ruleSetName.orNull)
      .build()
}
