package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CachePolicyProps {

  def apply(
    defaultTtl: Option[software.amazon.awscdk.Duration] = None,
    cookieBehavior: Option[software.amazon.awscdk.services.cloudfront.CacheCookieBehavior] = None,
    enableAcceptEncodingBrotli: Option[Boolean] = None,
    cachePolicyName: Option[String] = None,
    enableAcceptEncodingGzip: Option[Boolean] = None,
    maxTtl: Option[software.amazon.awscdk.Duration] = None,
    comment: Option[String] = None,
    minTtl: Option[software.amazon.awscdk.Duration] = None,
    headerBehavior: Option[software.amazon.awscdk.services.cloudfront.CacheHeaderBehavior] = None,
    queryStringBehavior: Option[software.amazon.awscdk.services.cloudfront.CacheQueryStringBehavior] = None
  ): software.amazon.awscdk.services.cloudfront.CachePolicyProps =
    (new software.amazon.awscdk.services.cloudfront.CachePolicyProps.Builder)
      .defaultTtl(defaultTtl.orNull)
      .cookieBehavior(cookieBehavior.orNull)
      .enableAcceptEncodingBrotli(enableAcceptEncodingBrotli.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cachePolicyName(cachePolicyName.orNull)
      .enableAcceptEncodingGzip(enableAcceptEncodingGzip.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxTtl(maxTtl.orNull)
      .comment(comment.orNull)
      .minTtl(minTtl.orNull)
      .headerBehavior(headerBehavior.orNull)
      .queryStringBehavior(queryStringBehavior.orNull)
      .build()
}
