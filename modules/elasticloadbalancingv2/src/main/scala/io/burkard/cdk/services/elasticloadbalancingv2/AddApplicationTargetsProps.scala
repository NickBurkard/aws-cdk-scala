package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddApplicationTargetsProps {

  def apply(
    protocolVersion: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion] = None,
    priority: Option[Number] = None,
    targets: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget]] = None,
    stickinessCookieDuration: Option[software.amazon.awscdk.Duration] = None,
    deregistrationDelay: Option[software.amazon.awscdk.Duration] = None,
    targetGroupName: Option[String] = None,
    loadBalancingAlgorithmType: Option[software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType] = None,
    port: Option[Number] = None,
    stickinessCookieName: Option[String] = None,
    slowStart: Option[software.amazon.awscdk.Duration] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None,
    conditions: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition]] = None,
    healthCheck: Option[software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps.Builder)
      .protocolVersion(protocolVersion.orNull)
      .priority(priority.orNull)
      .targets(targets.map(_.asJava).orNull)
      .stickinessCookieDuration(stickinessCookieDuration.orNull)
      .deregistrationDelay(deregistrationDelay.orNull)
      .targetGroupName(targetGroupName.orNull)
      .loadBalancingAlgorithmType(loadBalancingAlgorithmType.orNull)
      .port(port.orNull)
      .stickinessCookieName(stickinessCookieName.orNull)
      .slowStart(slowStart.orNull)
      .protocol(protocol.orNull)
      .conditions(conditions.map(_.asJava).orNull)
      .healthCheck(healthCheck.orNull)
      .build()
}
