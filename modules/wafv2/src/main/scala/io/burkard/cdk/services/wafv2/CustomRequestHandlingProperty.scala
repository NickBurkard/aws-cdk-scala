package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomRequestHandlingProperty {

  def apply(
    insertHeaders: List[_]
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty.Builder)
      .insertHeaders(insertHeaders.asJava)
      .build()
}
