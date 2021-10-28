package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AddRuleProps {

  def apply(
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    priority: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps.Builder)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .build()
}
