package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParametersInCacheKeyAndForwardedToOriginProperty {

  def apply(
    headersConfig: Option[software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty] = None,
    enableAcceptEncodingBrotli: Option[Boolean] = None,
    queryStringsConfig: Option[software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty] = None,
    enableAcceptEncodingGzip: Option[Boolean] = None,
    cookiesConfig: Option[software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty] = None
  ): software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty.Builder)
      .headersConfig(headersConfig.orNull)
      .enableAcceptEncodingBrotli(enableAcceptEncodingBrotli.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .queryStringsConfig(queryStringsConfig.orNull)
      .enableAcceptEncodingGzip(enableAcceptEncodingGzip.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cookiesConfig(cookiesConfig.orNull)
      .build()
}
