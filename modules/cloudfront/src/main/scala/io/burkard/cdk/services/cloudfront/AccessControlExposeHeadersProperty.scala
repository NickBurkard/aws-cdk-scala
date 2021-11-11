package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessControlExposeHeadersProperty {

  def apply(
    items: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty.Builder)
      .items(items.map(_.asJava).orNull)
      .build()
}