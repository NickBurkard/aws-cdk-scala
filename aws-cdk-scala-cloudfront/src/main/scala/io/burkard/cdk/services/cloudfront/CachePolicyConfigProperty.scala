package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CachePolicyConfigProperty {

  def apply(
    name: Option[String] = None,
    defaultTtl: Option[Number] = None,
    maxTtl: Option[Number] = None,
    parametersInCacheKeyAndForwardedToOrigin: Option[software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty] = None,
    comment: Option[String] = None,
    minTtl: Option[Number] = None
  ): software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty.Builder)
      .name(name.orNull)
      .defaultTtl(defaultTtl.orNull)
      .maxTtl(maxTtl.orNull)
      .parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin.orNull)
      .comment(comment.orNull)
      .minTtl(minTtl.orNull)
      .build()
}
