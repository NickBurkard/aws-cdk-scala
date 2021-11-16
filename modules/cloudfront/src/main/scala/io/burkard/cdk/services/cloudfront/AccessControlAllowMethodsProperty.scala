package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessControlAllowMethodsProperty {

  def apply(
    items: List[String]
  ): software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty =
    (new software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty.Builder)
      .items(items.asJava)
      .build()
}
