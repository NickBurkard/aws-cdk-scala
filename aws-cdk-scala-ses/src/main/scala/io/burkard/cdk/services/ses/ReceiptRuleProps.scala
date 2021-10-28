package io.burkard.cdk.services.ses

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReceiptRuleProps {

  def apply(
    receiptRuleName: Option[String] = None,
    scanEnabled: Option[Boolean] = None,
    recipients: Option[List[String]] = None,
    enabled: Option[Boolean] = None,
    ruleSet: Option[software.amazon.awscdk.services.ses.IReceiptRuleSet] = None,
    after: Option[software.amazon.awscdk.services.ses.IReceiptRule] = None,
    tlsPolicy: Option[software.amazon.awscdk.services.ses.TlsPolicy] = None,
    actions: Option[List[_ <: software.amazon.awscdk.services.ses.IReceiptRuleAction]] = None
  ): software.amazon.awscdk.services.ses.ReceiptRuleProps =
    (new software.amazon.awscdk.services.ses.ReceiptRuleProps.Builder)
      .receiptRuleName(receiptRuleName.orNull)
      .scanEnabled(scanEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .recipients(recipients.map(_.asJava).orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ruleSet(ruleSet.orNull)
      .after(after.orNull)
      .tlsPolicy(tlsPolicy.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
