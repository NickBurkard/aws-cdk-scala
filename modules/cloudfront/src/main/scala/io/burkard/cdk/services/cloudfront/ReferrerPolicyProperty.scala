package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ReferrerPolicyProperty {

  def apply(
    referrerPolicy: String,
    `override`: Boolean
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.ReferrerPolicyProperty.Builder)
      .referrerPolicy(referrerPolicy)
      .`override`(`override`)
      .build()
}
