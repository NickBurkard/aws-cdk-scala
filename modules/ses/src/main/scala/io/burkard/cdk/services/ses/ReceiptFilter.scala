package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReceiptFilter {

  def apply(
    internalResourceId: String,
    ip: Option[String] = None,
    receiptFilterName: Option[String] = None,
    policy: Option[software.amazon.awscdk.services.ses.ReceiptFilterPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.ReceiptFilter =
    software.amazon.awscdk.services.ses.ReceiptFilter.Builder
      .create(stackCtx, internalResourceId)
      .ip(ip.orNull)
      .receiptFilterName(receiptFilterName.orNull)
      .policy(policy.orNull)
      .build()
}
