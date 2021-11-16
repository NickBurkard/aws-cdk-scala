package io.burkard.cdk.services.waf

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWebACLProps {

  def apply(
    name: String,
    metricName: String,
    defaultAction: software.amazon.awscdk.services.waf.CfnWebACL.WafActionProperty,
    rules: Option[List[_]] = None
  ): software.amazon.awscdk.services.waf.CfnWebACLProps =
    (new software.amazon.awscdk.services.waf.CfnWebACLProps.Builder)
      .name(name)
      .metricName(metricName)
      .defaultAction(defaultAction)
      .rules(rules.map(_.asJava).orNull)
      .build()
}
