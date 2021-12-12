package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseHeadersContentSecurityPolicy {

  def apply(
    `override`: Boolean,
    contentSecurityPolicy: String
  ): software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy =
    (new software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy.Builder)
      .`override`(`override`)
      .contentSecurityPolicy(contentSecurityPolicy)
      .build()
}
