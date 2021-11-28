package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationListenerRule {

  def apply(
    internalResourceId: String,
    listener: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener,
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    priority: Option[Number] = None,
    targetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup]] = None,
    action: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule =
    software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule.Builder
      .create(stackCtx, internalResourceId)
      .listener(listener)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .action(action.orNull)
      .build()
}
