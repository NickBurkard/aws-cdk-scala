package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CustomResponseProperty {

  def apply(
    responseCode: Number,
    customResponseBodyKey: Option[String] = None,
    responseHeaders: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty.Builder)
      .responseCode(responseCode)
      .customResponseBodyKey(customResponseBodyKey.orNull)
      .responseHeaders(responseHeaders.map(_.asJava).orNull)
      .build()
}
