package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOriginRequestPolicy {

  def apply(
    internalResourceId: String,
    originRequestPolicyConfig: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy =
    software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.Builder
      .create(stackCtx, internalResourceId)
      .originRequestPolicyConfig(originRequestPolicyConfig)
      .build()
}
