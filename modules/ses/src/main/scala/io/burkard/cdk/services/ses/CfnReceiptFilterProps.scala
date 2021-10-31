package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReceiptFilterProps {

  def apply(
    filter: Option[software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptFilterProps =
    (new software.amazon.awscdk.services.ses.CfnReceiptFilterProps.Builder)
      .filter(filter.orNull)
      .build()
}
