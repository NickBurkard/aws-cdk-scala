package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnListenerRuleProps {

  def apply(
    conditions: List[_],
    priority: Number,
    listenerArn: String,
    actions: List[_]
  ): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps.Builder)
      .conditions(conditions.asJava)
      .priority(priority)
      .listenerArn(listenerArn)
      .actions(actions.asJava)
      .build()
}
