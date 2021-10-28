package io.burkard.cdk.services.elasticloadbalancing

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AppCookieStickinessPolicyProperty {

  def apply(
    policyName: Option[String] = None,
    cookieName: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder)
      .policyName(policyName.orNull)
      .cookieName(cookieName.orNull)
      .build()
}
