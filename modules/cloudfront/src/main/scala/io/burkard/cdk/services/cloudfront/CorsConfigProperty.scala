package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CorsConfigProperty {

  def apply(
    accessControlAllowOrigins: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty] = None,
    accessControlMaxAgeSec: Option[Number] = None,
    accessControlAllowHeaders: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty] = None,
    accessControlAllowCredentials: Option[Boolean] = None,
    originOverride: Option[Boolean] = None,
    accessControlExposeHeaders: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty] = None,
    accessControlAllowMethods: Option[software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.CorsConfigProperty.Builder)
      .accessControlAllowOrigins(accessControlAllowOrigins.orNull)
      .accessControlMaxAgeSec(accessControlMaxAgeSec.orNull)
      .accessControlAllowHeaders(accessControlAllowHeaders.orNull)
      .accessControlAllowCredentials(accessControlAllowCredentials.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .originOverride(originOverride.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .accessControlExposeHeaders(accessControlExposeHeaders.orNull)
      .accessControlAllowMethods(accessControlAllowMethods.orNull)
      .build()
}
