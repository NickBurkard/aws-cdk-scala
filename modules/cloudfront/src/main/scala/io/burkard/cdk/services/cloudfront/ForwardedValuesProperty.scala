package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ForwardedValuesProperty {

  def apply(
    queryString: Boolean,
    cookies: Option[software.amazon.awscdk.services.cloudfront.CfnDistribution.CookiesProperty] = None,
    queryStringCacheKeys: Option[List[String]] = None,
    headers: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnDistribution.ForwardedValuesProperty.Builder)
      .queryString(queryString)
      .cookies(cookies.orNull)
      .queryStringCacheKeys(queryStringCacheKeys.map(_.asJava).orNull)
      .headers(headers.map(_.asJava).orNull)
      .build()
}
