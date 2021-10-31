package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWebACLProps {

  def apply(
    name: Option[String] = None,
    metricName: Option[String] = None,
    defaultAction: Option[software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty] = None,
    rules: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.regional.CfnWebACLProps =
    (new software.amazon.awscdk.services.waf.regional.CfnWebACLProps.Builder)
      .name(name.orNull)
      .metricName(metricName.orNull)
      .defaultAction(defaultAction.orNull)
      .rules(rules.map(_.asJava).orNull)
      .build()
}
