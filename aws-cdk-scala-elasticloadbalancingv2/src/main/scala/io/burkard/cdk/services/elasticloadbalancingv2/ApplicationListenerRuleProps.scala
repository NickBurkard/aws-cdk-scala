package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApplicationListenerRuleProps {

  def apply(
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    priority: Option[Number] = None,
    listener: Option[software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener] = None,
    targetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup]] = None,
    action: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRuleProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRuleProps.Builder)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .listener(listener.orNull)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .action(action.orNull)
      .build()
}
