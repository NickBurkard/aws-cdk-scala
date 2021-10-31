package io.burkard.cdk.services.elasticloadbalancingv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTargetGroup {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    targets: Option[List[_]] = None,
    healthCheckProtocol: Option[String] = None,
    vpcId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    healthyThresholdCount: Option[Number] = None,
    matcher: Option[software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.MatcherProperty] = None,
    healthCheckPort: Option[String] = None,
    healthCheckEnabled: Option[Boolean] = None,
    ipAddressType: Option[String] = None,
    targetGroupAttributes: Option[List[_]] = None,
    targetType: Option[String] = None,
    protocol: Option[String] = None,
    unhealthyThresholdCount: Option[Number] = None,
    protocolVersion: Option[String] = None,
    healthCheckTimeoutSeconds: Option[Number] = None,
    healthCheckIntervalSeconds: Option[Number] = None,
    port: Option[Number] = None,
    healthCheckPath: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup =
    software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .targets(targets.map(_.asJava).orNull)
      .healthCheckProtocol(healthCheckProtocol.orNull)
      .vpcId(vpcId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .healthyThresholdCount(healthyThresholdCount.orNull)
      .matcher(matcher.orNull)
      .healthCheckPort(healthCheckPort.orNull)
      .healthCheckEnabled(healthCheckEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .ipAddressType(ipAddressType.orNull)
      .targetGroupAttributes(targetGroupAttributes.map(_.asJava).orNull)
      .targetType(targetType.orNull)
      .protocol(protocol.orNull)
      .unhealthyThresholdCount(unhealthyThresholdCount.orNull)
      .protocolVersion(protocolVersion.orNull)
      .healthCheckTimeoutSeconds(healthCheckTimeoutSeconds.orNull)
      .healthCheckIntervalSeconds(healthCheckIntervalSeconds.orNull)
      .port(port.orNull)
      .healthCheckPath(healthCheckPath.orNull)
      .build()
}
