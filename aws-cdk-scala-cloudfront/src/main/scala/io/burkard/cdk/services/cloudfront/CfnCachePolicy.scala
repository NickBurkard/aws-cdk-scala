package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCachePolicy {

  def apply(
    internalResourceId: String,
    cachePolicyConfig: Option[software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CfnCachePolicy =
    software.amazon.awscdk.services.cloudfront.CfnCachePolicy.Builder
      .create(stackCtx, internalResourceId)
      .cachePolicyConfig(cachePolicyConfig.orNull)
      .build()
}
