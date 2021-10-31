package io.burkard.cdk.services.ses

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DropSpamReceiptRule {

  def apply(
    internalResourceId: String,
    receiptRuleName: Option[String] = None,
    scanEnabled: Option[Boolean] = None,
    recipients: Option[List[String]] = None,
    enabled: Option[Boolean] = None,
    ruleSet: Option[software.amazon.awscdk.services.ses.IReceiptRuleSet] = None,
    after: Option[software.amazon.awscdk.services.ses.IReceiptRule] = None,
    tlsPolicy: Option[software.amazon.awscdk.services.ses.TlsPolicy] = None,
    actions: Option[List[_ <: software.amazon.awscdk.services.ses.IReceiptRuleAction]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.DropSpamReceiptRule =
    software.amazon.awscdk.services.ses.DropSpamReceiptRule.Builder
      .create(stackCtx, internalResourceId)
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
