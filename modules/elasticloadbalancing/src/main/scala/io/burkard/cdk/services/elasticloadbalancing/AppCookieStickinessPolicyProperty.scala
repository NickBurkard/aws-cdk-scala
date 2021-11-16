package io.burkard.cdk.services.elasticloadbalancing

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AppCookieStickinessPolicyProperty {

  def apply(
    policyName: String,
    cookieName: String
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder)
      .policyName(policyName)
      .cookieName(cookieName)
      .build()
}
