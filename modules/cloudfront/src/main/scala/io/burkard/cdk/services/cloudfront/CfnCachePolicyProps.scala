package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCachePolicyProps {

  def apply(
    cachePolicyConfig: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty
  ): software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps =
    (new software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps.Builder)
      .cachePolicyConfig(cachePolicyConfig)
      .build()
}
