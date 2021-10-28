package io.burkard.cdk.services.elasticloadbalancing

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LBCookieStickinessPolicyProperty {

  def apply(
    policyName: Option[String] = None,
    cookieExpirationPeriod: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder)
      .policyName(policyName.orNull)
      .cookieExpirationPeriod(cookieExpirationPeriod.orNull)
      .build()
}
