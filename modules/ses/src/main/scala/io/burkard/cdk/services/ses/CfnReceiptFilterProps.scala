package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnReceiptFilterProps {

  def apply(
    filter: Option[software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptFilterProps =
    (new software.amazon.awscdk.services.ses.CfnReceiptFilterProps.Builder)
      .filter(filter.orNull)
      .build()
}
