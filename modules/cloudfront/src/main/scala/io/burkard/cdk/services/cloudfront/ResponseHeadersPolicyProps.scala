package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseHeadersPolicyProps {

  def apply(
    comment: Option[String] = None,
    customHeadersBehavior: Option[software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior] = None,
    responseHeadersPolicyName: Option[String] = None,
    securityHeadersBehavior: Option[software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior] = None,
    corsBehavior: Option[software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior] = None
  ): software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps =
    (new software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps.Builder)
      .comment(comment.orNull)
      .customHeadersBehavior(customHeadersBehavior.orNull)
      .responseHeadersPolicyName(responseHeadersPolicyName.orNull)
      .securityHeadersBehavior(securityHeadersBehavior.orNull)
      .corsBehavior(corsBehavior.orNull)
      .build()
}
