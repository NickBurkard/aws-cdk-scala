package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GeoMatchStatementProperty {

  def apply(
    countryCodes: Option[List[String]] = None,
    forwardedIpConfig: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.ForwardedIPConfigurationProperty] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.GeoMatchStatementProperty.Builder)
      .countryCodes(countryCodes.map(_.asJava).orNull)
      .forwardedIpConfig(forwardedIpConfig.orNull)
      .build()
}
