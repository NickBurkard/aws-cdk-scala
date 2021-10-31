package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRuleProps {

  def apply(
    metricName: Option[String] = None,
    name: Option[String] = None,
    predicates: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.regional.CfnRuleProps =
    (new software.amazon.awscdk.services.waf.regional.CfnRuleProps.Builder)
      .metricName(metricName.orNull)
      .name(name.orNull)
      .predicates(predicates.map(_.asJava).orNull)
      .build()
}
