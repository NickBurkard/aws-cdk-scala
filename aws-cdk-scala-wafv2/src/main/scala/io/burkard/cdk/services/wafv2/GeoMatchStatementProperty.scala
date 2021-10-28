package io.burkard.cdk.services.wafv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GeoMatchStatementProperty {

  def apply(
    countryCodes: Option[List[String]] = None,
    forwardedIpConfig: Option[software.amazon.awscdk.services.wafv2.CfnWebACL.ForwardedIPConfigurationProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.GeoMatchStatementProperty.Builder)
      .countryCodes(countryCodes.map(_.asJava).orNull)
      .forwardedIpConfig(forwardedIpConfig.orNull)
      .build()
}
