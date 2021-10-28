package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReceiptFilterProps {

  def apply(
    ip: Option[String] = None,
    receiptFilterName: Option[String] = None,
    policy: Option[software.amazon.awscdk.services.ses.ReceiptFilterPolicy] = None
  ): software.amazon.awscdk.services.ses.ReceiptFilterProps =
    (new software.amazon.awscdk.services.ses.ReceiptFilterProps.Builder)
      .ip(ip.orNull)
      .receiptFilterName(receiptFilterName.orNull)
      .policy(policy.orNull)
      .build()
}
