package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ContentSecurityPolicyProperty {

  def apply(
    `override`: Option[Boolean] = None,
    contentSecurityPolicy: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty.Builder)
      .`override`(`override`.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .contentSecurityPolicy(contentSecurityPolicy.orNull)
      .build()
}
