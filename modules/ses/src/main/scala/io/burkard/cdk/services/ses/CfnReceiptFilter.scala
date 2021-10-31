package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReceiptFilter {

  def apply(
    internalResourceId: String,
    filter: Option[software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.CfnReceiptFilter =
    software.amazon.awscdk.services.ses.CfnReceiptFilter.Builder
      .create(stackCtx, internalResourceId)
      .filter(filter.orNull)
      .build()
}
