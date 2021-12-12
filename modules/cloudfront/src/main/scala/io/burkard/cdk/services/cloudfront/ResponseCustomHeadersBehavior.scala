package io.burkard.cdk.services.cloudfront

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResponseCustomHeadersBehavior {

  def apply(
    customHeaders: List[_ <: software.amazon.awscdk.services.cloudfront.ResponseCustomHeader]
  ): software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior =
    (new software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior.Builder)
      .customHeaders(customHeaders.asJava)
      .build()
}
