package io.burkard.cdk.services.ses

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IpFilterProperty {

  def apply(
    cidr: String,
    policy: String
  ): software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty =
    (new software.amazon.awscdk.services.ses.CfnReceiptFilter.IpFilterProperty.Builder)
      .cidr(cidr)
      .policy(policy)
      .build()
}
