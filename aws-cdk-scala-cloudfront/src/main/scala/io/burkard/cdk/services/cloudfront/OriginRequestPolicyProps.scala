package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginRequestPolicyProps {

  def apply(
    cookieBehavior: Option[software.amazon.awscdk.services.cloudfront.OriginRequestCookieBehavior] = None,
    originRequestPolicyName: Option[String] = None,
    comment: Option[String] = None,
    headerBehavior: Option[software.amazon.awscdk.services.cloudfront.OriginRequestHeaderBehavior] = None,
    queryStringBehavior: Option[software.amazon.awscdk.services.cloudfront.OriginRequestQueryStringBehavior] = None
  ): software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps =
    (new software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps.Builder)
      .cookieBehavior(cookieBehavior.orNull)
      .originRequestPolicyName(originRequestPolicyName.orNull)
      .comment(comment.orNull)
      .headerBehavior(headerBehavior.orNull)
      .queryStringBehavior(queryStringBehavior.orNull)
      .build()
}
