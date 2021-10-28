package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CookiesConfigProperty {

  def apply(
    cookieBehavior: Option[String] = None,
    cookies: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnCachePolicy.CookiesConfigProperty.Builder)
      .cookieBehavior(cookieBehavior.orNull)
      .cookies(cookies.map(_.asJava).orNull)
      .build()
}
