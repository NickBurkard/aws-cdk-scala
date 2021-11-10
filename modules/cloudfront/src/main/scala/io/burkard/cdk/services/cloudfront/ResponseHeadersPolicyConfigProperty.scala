package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseHeadersPolicyConfigProperty {

  def apply(
    corsConfig: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty] = None,
    securityHeadersConfig: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty] = None,
    comment: Option[String] = None,
    name: Option[String] = None,
    customHeadersConfig: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.Builder)
      .corsConfig(corsConfig.orNull)
      .securityHeadersConfig(securityHeadersConfig.orNull)
      .comment(comment.orNull)
      .name(name.orNull)
      .customHeadersConfig(customHeadersConfig.orNull)
      .build()
}
