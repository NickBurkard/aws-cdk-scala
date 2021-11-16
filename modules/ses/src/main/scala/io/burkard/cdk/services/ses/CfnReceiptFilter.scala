package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReceiptFilter {

  def apply(
    internalResourceId: String,
    filter: software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ses.CfnReceiptFilter =
    software.amazon.awscdk.services.ses.CfnReceiptFilter.Builder
      .create(stackCtx, internalResourceId)
      .filter(filter)
      .build()
}
