package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnListenerRule {

  def apply(
    internalResourceId: String,
    conditions: List[_],
    priority: Number,
    listenerArn: String,
    actions: List[_]
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule =
    software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule.Builder
      .create(stackCtx, internalResourceId)
      .conditions(conditions.asJava)
      .priority(priority)
      .listenerArn(listenerArn)
      .actions(actions.asJava)
      .build()
}
