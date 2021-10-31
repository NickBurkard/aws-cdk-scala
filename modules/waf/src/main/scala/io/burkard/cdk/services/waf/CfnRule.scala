package io.burkard.cdk.services.waf

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRule {

  def apply(
    internalResourceId: String,
    metricName: Option[String] = None,
    name: Option[String] = None,
    predicates: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.regional.CfnRule =
    software.amazon.awscdk.services.waf.regional.CfnRule.Builder
      .create(stackCtx, internalResourceId)
      .metricName(metricName.orNull)
      .name(name.orNull)
      .predicates(predicates.map(_.asJava).orNull)
      .build()
}
