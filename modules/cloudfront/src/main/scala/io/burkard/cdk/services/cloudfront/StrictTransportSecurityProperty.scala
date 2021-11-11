package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StrictTransportSecurityProperty {

  def apply(
    includeSubdomains: Option[Boolean] = None,
    `override`: Option[Boolean] = None,
    accessControlMaxAgeSec: Option[Number] = None,
    preload: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.StrictTransportSecurityProperty.Builder)
      .includeSubdomains(includeSubdomains.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .`override`(`override`.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .accessControlMaxAgeSec(accessControlMaxAgeSec.orNull)
      .preload(preload.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
