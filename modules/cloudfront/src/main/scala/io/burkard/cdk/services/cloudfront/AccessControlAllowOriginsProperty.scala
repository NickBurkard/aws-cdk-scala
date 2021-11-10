package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessControlAllowOriginsProperty {

  def apply(
    items: Option[List[String]] = None
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty.Builder)
      .items(items.map(_.asJava).orNull)
      .build()
}
