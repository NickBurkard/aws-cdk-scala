package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OriginRequestPolicyConfigProperty {

  def apply(
    name: String,
    headersConfig: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty,
    cookiesConfig: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty,
    queryStringsConfig: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.Builder)
      .name(name)
      .headersConfig(headersConfig)
      .cookiesConfig(cookiesConfig)
      .queryStringsConfig(queryStringsConfig)
      .comment(comment.orNull)
      .build()
}
