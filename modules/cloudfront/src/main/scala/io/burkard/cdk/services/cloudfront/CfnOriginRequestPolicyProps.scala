package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnOriginRequestPolicyProps {

  def apply(
    originRequestPolicyConfig: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty
  ): software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps =
    (new software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps.Builder)
      .originRequestPolicyConfig(originRequestPolicyConfig)
      .build()
}
