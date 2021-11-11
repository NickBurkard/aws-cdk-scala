package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddRuleProps {

  def apply(
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    priority: Option[Number] = None,
    pathPatterns: Option[List[String]] = None,
    pathPattern: Option[String] = None,
    hostHeader: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps.Builder)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .pathPatterns(pathPatterns.map(_.asJava).orNull)
      .pathPattern(pathPattern.orNull)
      .hostHeader(hostHeader.orNull)
      .build()
}
