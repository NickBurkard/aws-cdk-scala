package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParametersInCacheKeyAndForwardedToOriginProperty {

  def apply(
    headersConfig: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty,
    queryStringsConfig: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty,
    enableAcceptEncodingGzip: Boolean,
    cookiesConfig: software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty,
    enableAcceptEncodingBrotli: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty.Builder)
      .headersConfig(headersConfig)
      .queryStringsConfig(queryStringsConfig)
      .enableAcceptEncodingGzip(enableAcceptEncodingGzip)
      .cookiesConfig(cookiesConfig)
      .enableAcceptEncodingBrotli(enableAcceptEncodingBrotli.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
