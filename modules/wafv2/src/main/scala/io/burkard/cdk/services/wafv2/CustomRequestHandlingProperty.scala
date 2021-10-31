package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomRequestHandlingProperty {

  def apply(
    insertHeaders: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.CustomRequestHandlingProperty.Builder)
      .insertHeaders(insertHeaders.map(_.asJava).orNull)
      .build()
}
