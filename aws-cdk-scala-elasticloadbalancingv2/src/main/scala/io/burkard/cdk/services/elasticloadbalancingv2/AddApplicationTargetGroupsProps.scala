package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AddApplicationTargetGroupsProps {

  def apply(
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    priority: Option[Number] = None,
    targetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps.Builder)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .build()
}
