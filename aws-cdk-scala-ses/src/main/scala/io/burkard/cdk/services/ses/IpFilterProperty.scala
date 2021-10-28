package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IpFilterProperty {

  def apply(
    cidr: Option[String] = None,
    policy: Option[String] = None
  ): software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty.Builder)
      .cidr(cidr.orNull)
      .policy(policy.orNull)
      .build()
}
