package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseHeadersReferrerPolicy {

  def apply(
    referrerPolicy: software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy,
    `override`: Boolean
  ): software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy =
    (new software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy.Builder)
      .referrerPolicy(referrerPolicy)
      .`override`(`override`)
      .build()
}
