package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRule {

  def apply(
    internalResourceId: String,
    metricName: String,
    name: String,
    predicates: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.CfnRule =
    software.amazon.awscdk.services.waf.CfnRule.Builder
      .create(stackCtx, internalResourceId)
      .metricName(metricName)
      .name(name)
      .predicates(predicates.map(_.asJava).orNull)
      .build()
}
