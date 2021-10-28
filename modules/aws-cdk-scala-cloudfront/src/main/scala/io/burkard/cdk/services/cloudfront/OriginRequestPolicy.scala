package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginRequestPolicy {

  def apply(
    internalResourceId: String,
    cookieBehavior: Option[software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior] = None,
    originRequestPolicyName: Option[String] = None,
    comment: Option[String] = None,
    headerBehavior: Option[software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior] = None,
    queryStringBehavior: Option[software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.OriginRequestPolicy =
    software.amazon.awscdk.services.cloudfront.OriginRequestPolicy.Builder
      .create(stackCtx, internalResourceId)
      .cookieBehavior(cookieBehavior.orNull)
      .originRequestPolicyName(originRequestPolicyName.orNull)
      .comment(comment.orNull)
      .headerBehavior(headerBehavior.orNull)
      .queryStringBehavior(queryStringBehavior.orNull)
      .build()
}
