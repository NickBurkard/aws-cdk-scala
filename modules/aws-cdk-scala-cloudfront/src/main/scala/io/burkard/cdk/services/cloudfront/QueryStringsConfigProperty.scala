package io.burkard.cdk.services.cloudfront

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
