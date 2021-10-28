package io.burkard.cdk.services.ses

sealed abstract class ReceiptFilterPolicy(val underlying: software.amazon.awscdk.services.ses.ReceiptFilterPolicy)
  extends Product
    with Serializable

object ReceiptFilterPolicy {
  implicit def toAws(value: ReceiptFilterPolicy): software.amazon.awscdk.services.ses.ReceiptFilterPolicy =
    Option(value).map(_.underlying).orNull

  case object Allow
    extends ReceiptFilterPolicy(software.amazon.awscdk.services.ses.ReceiptFilterPolicy.ALLOW)

  case object Block
    extends ReceiptFilterPolicy(software.amazon.awscdk.services.ses.ReceiptFilterPolicy.BLOCK)
}
