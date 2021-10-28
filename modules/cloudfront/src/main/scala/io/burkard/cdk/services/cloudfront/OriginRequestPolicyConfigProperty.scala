package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OriginRequestPolicyConfigProperty {

  def apply(
    name: Option[String] = None,
    headersConfig: Option[software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty] = None,
    cookiesConfig: Option[software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.CookiesConfigProperty] = None,
    queryStringsConfig: Option[software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.QueryStringsConfigProperty] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.Builder)
      .name(name.orNull)
      .headersConfig(headersConfig.orNull)
      .cookiesConfig(cookiesConfig.orNull)
      .queryStringsConfig(queryStringsConfig.orNull)
      .comment(comment.orNull)
      .build()
}
