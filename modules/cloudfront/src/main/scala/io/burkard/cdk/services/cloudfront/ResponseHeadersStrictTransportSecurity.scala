package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseHeadersStrictTransportSecurity {

  def apply(
    `override`: Boolean,
    accessControlMaxAge: software.amazon.awscdk.Duration,
    includeSubdomains: Option[Boolean] = None,
    preload: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity =
    (new software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity.Builder)
      .`override`(`override`)
      .accessControlMaxAge(accessControlMaxAge)
      .includeSubdomains(includeSubdomains.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .preload(preload.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
