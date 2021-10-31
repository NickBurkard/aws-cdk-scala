package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HeadersConfigProperty {

  def apply(
    headerBehavior: Option[String] = None,
    headers: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnCachePolicy.HeadersConfigProperty.Builder)
      .headerBehavior(headerBehavior.orNull)
      .headers(headers.map(_.asJava).orNull)
      .build()
}
