package io.burkard.cdk.services.elasticloadbalancingv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object NetworkTargetGroupProps {

  def apply(
    healthCheck: Option[software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck] = None,
    preserveClientIp: Option[Boolean] = None,
    targets: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget]] = None,
    deregistrationDelay: Option[software.amazon.awscdk.Duration] = None,
    proxyProtocolV2: Option[Boolean] = None,
    targetGroupName: Option[String] = None,
    port: Option[Number] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    targetType: Option[software.amazon.awscdk.services.elasticloadbalancingv2.TargetType] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.Protocol] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps.Builder)
      .healthCheck(healthCheck.orNull)
      .preserveClientIp(preserveClientIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .targets(targets.map(_.asJava).orNull)
      .deregistrationDelay(deregistrationDelay.orNull)
      .proxyProtocolV2(proxyProtocolV2.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .targetGroupName(targetGroupName.orNull)
      .port(port.orNull)
      .vpc(vpc.orNull)
      .targetType(targetType.orNull)
      .protocol(protocol.orNull)
      .build()
}
