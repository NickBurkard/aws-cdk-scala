package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnListenerRule {

  def apply(
    internalResourceId: String,
    conditions: Option[List[_]] = None,
    priority: Option[Number] = None,
    listenerArn: Option[String] = None,
    actions: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule =
    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.Builder
      .create(stackCtx, internalResourceId)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .listenerArn(listenerArn.orNull)
      .actions(actions.map(_.asJava).orNull)
      .build()
}