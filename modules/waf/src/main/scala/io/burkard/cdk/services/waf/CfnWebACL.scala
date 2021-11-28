package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWebACL {

  def apply(
    internalResourceId: String,
    name: String,
    metricName: String,
    defaultAction: software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty,
    rules: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.waf.CfnWebACL =
    software.amazon.awscdk.services.waf.CfnWebACL.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .metricName(metricName)
      .defaultAction(defaultAction)
      .rules(rules.map(_.asJava).orNull)
      .build()
}
