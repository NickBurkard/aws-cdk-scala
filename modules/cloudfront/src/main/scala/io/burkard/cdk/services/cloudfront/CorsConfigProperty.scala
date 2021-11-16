package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CorsConfigProperty {

  def apply(
    accessControlAllowOrigins: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty,
    accessControlAllowHeaders: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty,
    accessControlAllowCredentials: Boolean,
    originOverride: Boolean,
    accessControlAllowMethods: software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty,
    accessControlMaxAgeSec: Option[Number] = None,
    accessControlExposeHeaders: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty.Builder)
      .accessControlAllowOrigins(accessControlAllowOrigins)
      .accessControlAllowHeaders(accessControlAllowHeaders)
      .accessControlAllowCredentials(accessControlAllowCredentials)
      .originOverride(originOverride)
      .accessControlAllowMethods(accessControlAllowMethods)
      .accessControlMaxAgeSec(accessControlMaxAgeSec.orNull)
      .accessControlExposeHeaders(accessControlExposeHeaders.orNull)
      .build()
}
