package io.burkard.cdk.services.ses

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
