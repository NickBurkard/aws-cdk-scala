package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnListenerRuleProps {

  def apply(
    conditions: Option[List[_]] = None,
    priority: Option[Number] = None,
    listenerArn: Option[String] = None,
    actions: Option[List[_]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps.Builder)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .listenerArn(listenerArn.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}
