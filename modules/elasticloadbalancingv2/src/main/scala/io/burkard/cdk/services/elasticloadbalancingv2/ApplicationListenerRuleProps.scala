package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationListenerRuleProps {

  def apply(
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    priority: Option[Number] = None,
    listener: Option[software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener] = None,
    pathPattern: Option[String] = None,
    fixedResponse: Option[software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponse] = None,
    redirectResponse: Option[software.amazon.awscdk.services.elasticloadbalancingv2.RedirectResponse] = None,
    action: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction] = None,
    hostHeader: Option[String] = None,
    targetGroups: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup]] = None,
    pathPatterns: Option[List[String]] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRuleProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRuleProps.Builder)
      .conditions(conditions.map(_.asJava).orNull)
      .priority(priority.orNull)
      .listener(listener.orNull)
      .pathPattern(pathPattern.orNull)
      .fixedResponse(fixedResponse.orNull)
      .redirectResponse(redirectResponse.orNull)
      .action(action.orNull)
      .hostHeader(hostHeader.orNull)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .pathPatterns(pathPatterns.map(_.asJava).orNull)
      .build()
}
