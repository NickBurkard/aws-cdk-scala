package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddNetworkTargetsProps {

  def apply(
    healthCheck: Option[software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck] = None,
    preserveClientIp: Option[Boolean] = None,
    targets: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget]] = None,
    deregistrationDelay: Option[software.amazon.awscdk.Duration] = None,
    proxyProtocolV2: Option[Boolean] = None,
    targetGroupName: Option[String] = None,
    port: Option[Number] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.Protocol] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps.Builder)
      .healthCheck(healthCheck.orNull)
      .preserveClientIp(preserveClientIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .targets(targets.map(_.asJava).orNull)
      .deregistrationDelay(deregistrationDelay.orNull)
      .proxyProtocolV2(proxyProtocolV2.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .targetGroupName(targetGroupName.orNull)
      .port(port.orNull)
      .protocol(protocol.orNull)
      .build()
}
