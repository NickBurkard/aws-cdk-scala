package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CachePolicyConfigProperty {

  def apply(
    name: String,
    defaultTtl: Number,
    maxTtl: Number,
    parametersInCacheKeyAndForwardedToOrigin: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty,
    minTtl: Number,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CachePolicyConfigProperty.Builder)
      .name(name)
      .defaultTtl(defaultTtl)
      .maxTtl(maxTtl)
      .parametersInCacheKeyAndForwardedToOrigin(parametersInCacheKeyAndForwardedToOrigin)
      .minTtl(minTtl)
      .comment(comment.orNull)
      .build()
}
