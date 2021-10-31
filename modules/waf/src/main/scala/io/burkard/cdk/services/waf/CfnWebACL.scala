package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWebACL {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    metricName: Option[String] = None,
    defaultAction: Option[software.amazon.awscdk.services.waf.regional.CfnWebACL.ActionProperty] = None,
    rules: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnWebACL =
    software.amazon.awscdk.services.waf.regional.CfnWebACL.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .metricName(metricName.orNull)
      .defaultAction(defaultAction.orNull)
      .rules(rules.map(_.asJava).orNull)
      .build()
}
