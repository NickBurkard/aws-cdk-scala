package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCachePolicyProps {

  def apply(
    cachePolicyConfig: Option[software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps =
    (new software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps.Builder)
      .cachePolicyConfig(cachePolicyConfig.orNull)
      .build()
}
