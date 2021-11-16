package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContentSecurityPolicyProperty {

  def apply(
    `override`: Boolean,
    contentSecurityPolicy: String
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.Builder)
      .`override`(`override`)
      .contentSecurityPolicy(contentSecurityPolicy)
      .build()
}
