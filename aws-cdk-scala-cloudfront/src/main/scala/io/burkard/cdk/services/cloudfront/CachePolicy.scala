package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CachePolicy {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CachePolicy =
    software.amazon.awscdk.services.cloudfront.CachePolicy.Builder
      .create(stackCtx, internalResourceId)
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
