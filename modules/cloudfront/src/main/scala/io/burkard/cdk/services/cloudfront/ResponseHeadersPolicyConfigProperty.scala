package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseHeadersPolicyConfigProperty {

  def apply(
    name: String,
    corsConfig: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty] = None,
    securityHeadersConfig: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.SecurityHeadersConfigProperty] = None,
    comment: Option[String] = None,
    customHeadersConfig: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CustomHeadersConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty.Builder)
      .name(name)
      .corsConfig(corsConfig.orNull)
      .securityHeadersConfig(securityHeadersConfig.orNull)
      .comment(comment.orNull)
      .customHeadersConfig(customHeadersConfig.orNull)
      .build()
}
