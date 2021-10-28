package io.burkard.cdk.services.ses

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReceiptRuleSet {

  def apply(
    internalResourceId: String,
    receiptRuleSetName: Option[String] = None,
    dropSpam: Option[Boolean] = None,
    rules: Option[List[_ <: software.amazon.awscdk.services.ses.ReceiptRuleOptions]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.ReceiptRuleSet =
    software.amazon.awscdk.services.ses.ReceiptRuleSet.Builder
      .create(stackCtx, internalResourceId)
      .receiptRuleSetName(receiptRuleSetName.orNull)
      .dropSpam(dropSpam.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .rules(rules.map(_.asJava).orNull)
      .build()
}
