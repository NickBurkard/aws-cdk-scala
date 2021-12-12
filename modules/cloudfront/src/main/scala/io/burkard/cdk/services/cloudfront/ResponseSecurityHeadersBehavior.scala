package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseSecurityHeadersBehavior {

  def apply(
    xssProtection: Option[software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection] = None,
    contentTypeOptions: Option[software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions] = None,
    referrerPolicy: Option[software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy] = None,
    contentSecurityPolicy: Option[software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy] = None,
    frameOptions: Option[software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions] = None,
    strictTransportSecurity: Option[software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity] = None
  ): software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior =
    (new software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior.Builder)
      .xssProtection(xssProtection.orNull)
      .contentTypeOptions(contentTypeOptions.orNull)
      .referrerPolicy(referrerPolicy.orNull)
      .contentSecurityPolicy(contentSecurityPolicy.orNull)
      .frameOptions(frameOptions.orNull)
      .strictTransportSecurity(strictTransportSecurity.orNull)
      .build()
}
