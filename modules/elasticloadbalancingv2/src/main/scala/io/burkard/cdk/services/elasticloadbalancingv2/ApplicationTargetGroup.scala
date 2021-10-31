package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationTargetGroup {

  def apply(
    internalResourceId: String,
    protocolVersion: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocolVersion] = None,
    healthCheck: Option[software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck] = None,
    targets: Option[List[_ <: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerTarget]] = None,
    stickinessCookieDuration: Option[software.amazon.awscdk.Duration] = None,
    deregistrationDelay: Option[software.amazon.awscdk.Duration] = None,
    targetGroupName: Option[String] = None,
    loadBalancingAlgorithmType: Option[software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupLoadBalancingAlgorithmType] = None,
    port: Option[Number] = None,
    stickinessCookieName: Option[String] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    targetType: Option[software.amazon.awscdk.services.elasticloadbalancingv2.TargetType] = None,
    slowStart: Option[software.amazon.awscdk.Duration] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup =
    software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup.Builder
      .create(stackCtx, internalResourceId)
      .protocolVersion(protocolVersion.orNull)
      .healthCheck(healthCheck.orNull)
      .targets(targets.map(_.asJava).orNull)
      .stickinessCookieDuration(stickinessCookieDuration.orNull)
      .deregistrationDelay(deregistrationDelay.orNull)
      .targetGroupName(targetGroupName.orNull)
      .loadBalancingAlgorithmType(loadBalancingAlgorithmType.orNull)
      .port(port.orNull)
      .stickinessCookieName(stickinessCookieName.orNull)
      .vpc(vpc.orNull)
      .targetType(targetType.orNull)
      .slowStart(slowStart.orNull)
      .protocol(protocol.orNull)
      .build()
}
