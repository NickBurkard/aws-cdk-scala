package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnOriginRequestPolicyProps {

  def apply(
    originRequestPolicyConfig: Option[software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps =
    (new software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps.Builder)
      .originRequestPolicyConfig(originRequestPolicyConfig.orNull)
      .build()
}
