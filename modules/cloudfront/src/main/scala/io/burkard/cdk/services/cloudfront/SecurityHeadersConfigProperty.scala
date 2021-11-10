package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SecurityHeadersConfigProperty {

  def apply(
    xssProtection: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.XSSProtectionProperty] = None,
    contentTypeOptions: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentTypeOptionsProperty] = None,
    referrerPolicy: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty] = None,
    contentSecurityPolicy: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ContentSecurityPolicyProperty] = None,
    frameOptions: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.FrameOptionsProperty] = None,
    strictTransportSecurity: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty.Builder)
      .xssProtection(xssProtection.orNull)
      .contentTypeOptions(contentTypeOptions.orNull)
      .referrerPolicy(referrerPolicy.orNull)
      .contentSecurityPolicy(contentSecurityPolicy.orNull)
      .frameOptions(frameOptions.orNull)
      .strictTransportSecurity(strictTransportSecurity.orNull)
      .build()
}
