package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FilterProperty {

  def apply(
    ipFilter: software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty,
    name: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty.Builder)
      .ipFilter(ipFilter)
      .name(name.orNull)
      .build()
}
