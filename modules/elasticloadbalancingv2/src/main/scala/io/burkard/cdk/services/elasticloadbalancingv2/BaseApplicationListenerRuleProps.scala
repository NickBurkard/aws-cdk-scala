package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaseApplicationListenerRuleProps {

  def apply(
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    priority: Option[Number] = None,
    targetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup]] = None,
    action: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerRuleProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerRuleProps.Builder)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .action(action.orNull)
      .build()
}
