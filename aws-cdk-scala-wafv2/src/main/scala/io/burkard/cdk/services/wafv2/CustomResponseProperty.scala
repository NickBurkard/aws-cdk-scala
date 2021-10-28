package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CustomResponseProperty {

  def apply(
    responseCode: Option[Number] = None,
    customResponseBodyKey: Option[String] = None,
    responseHeaders: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.CustomResponseProperty.Builder)
      .responseCode(responseCode.orNull)
      .customResponseBodyKey(customResponseBodyKey.orNull)
      .responseHeaders(responseHeaders.map(_.asJava).orNull)
      .build()
}
