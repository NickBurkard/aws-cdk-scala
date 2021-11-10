package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object QueryStringsConfigProperty {

  def apply(
    queryStringBehavior: Option[String] = None,
    queryStrings: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnCachePolicy.QueryStringsConfigProperty.Builder)
      .queryStringBehavior(queryStringBehavior.orNull)
      .queryStrings(queryStrings.map(_.asJava).orNull)
      .build()
}
