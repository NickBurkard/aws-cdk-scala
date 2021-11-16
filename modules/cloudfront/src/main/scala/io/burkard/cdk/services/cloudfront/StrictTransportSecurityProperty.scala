package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StrictTransportSecurityProperty {

  def apply(
    `override`: Boolean,
    accessControlMaxAgeSec: Number,
    includeSubdomains: Option[Boolean] = None,
    preload: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty.Builder)
      .`override`(`override`)
      .accessControlMaxAgeSec(accessControlMaxAgeSec)
      .includeSubdomains(includeSubdomains.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .preload(preload.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
