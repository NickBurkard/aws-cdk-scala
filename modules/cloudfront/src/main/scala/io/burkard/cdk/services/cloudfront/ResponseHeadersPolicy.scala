package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseHeadersPolicy {

  def apply(
    internalResourceId: String,
    comment: Option[String] = None,
    customHeadersBehavior: Option[software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior] = None,
    responseHeadersPolicyName: Option[String] = None,
    securityHeadersBehavior: Option[software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior] = None,
    corsBehavior: Option[software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy =
    software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy.Builder
      .create(stackCtx, internalResourceId)
      .comment(comment.orNull)
      .customHeadersBehavior(customHeadersBehavior.orNull)
      .responseHeadersPolicyName(responseHeadersPolicyName.orNull)
      .securityHeadersBehavior(securityHeadersBehavior.orNull)
      .corsBehavior(corsBehavior.orNull)
      .build()
}
