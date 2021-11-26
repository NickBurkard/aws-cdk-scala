package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HeadersConfigProperty {

  def apply(
    headerBehavior: String,
    headers: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy.HeadersConfigProperty.Builder)
      .headerBehavior(headerBehavior)
      .headers(headers.map(_.asJava).orNull)
      .build()
}
