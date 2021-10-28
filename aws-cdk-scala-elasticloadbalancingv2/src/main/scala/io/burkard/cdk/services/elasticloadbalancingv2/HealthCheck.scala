package io.burkard.cdk.services.elasticloadbalancingv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HealthCheck {

  def apply(
    unhealthyThresholdCount: Option[Number] = None,
    enabled: Option[Boolean] = None,
    healthyThresholdCount: Option[Number] = None,
    interval: Option[software.amazon.awscdk.Duration] = None,
    port: Option[String] = None,
    healthyHttpCodes: Option[String] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancingv2.Protocol] = None,
    path: Option[String] = None,
    healthyGrpcCodes: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck =
    (new software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck.Builder)
      .unhealthyThresholdCount(unhealthyThresholdCount.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .healthyThresholdCount(healthyThresholdCount.orNull)
      .interval(interval.orNull)
      .port(port.orNull)
      .healthyHttpCodes(healthyHttpCodes.orNull)
      .timeout(timeout.orNull)
      .protocol(protocol.orNull)
      .path(path.orNull)
      .healthyGrpcCodes(healthyGrpcCodes.orNull)
      .build()
}
