package io.burkard.cdk.services.ses

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReceiptRuleSetProps {

  def apply(
    receiptRuleSetName: Option[String] = None,
    dropSpam: Option[Boolean] = None,
    rules: Option[List[_ <: software.amazon.awscdk.services.ses.ReceiptRuleOptions]] = None
  ): software.amazon.awscdk.services.ses.ReceiptRuleSetProps =
    (new software.amazon.awscdk.services.ses.ReceiptRuleSetProps.Builder)
      .receiptRuleSetName(receiptRuleSetName.orNull)
      .dropSpam(dropSpam.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .rules(rules.map(_.asJava).orNull)
      .build()
}
