package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FilterProperty {

  def apply(
    name: Option[String] = None,
    ipFilter: Option[software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptFilter.FilterProperty.Builder)
      .name(name.orNull)
      .ipFilter(ipFilter.orNull)
      .build()
}
