package io.burkard.cdk.services.elasticloadbalancing

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HealthCheck {

  def apply(
    port: Number,
    path: Option[String] = None,
    interval: Option[software.amazon.awscdk.Duration] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    protocol: Option[software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol] = None,
    healthyThreshold: Option[Number] = None,
    unhealthyThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.HealthCheck =
    (new software.amazon.awscdk.services.elasticloadbalancing.HealthCheck.Builder)
      .port(port)
      .path(path.orNull)
      .interval(interval.orNull)
      .timeout(timeout.orNull)
      .protocol(protocol.orNull)
      .healthyThreshold(healthyThreshold.orNull)
      .unhealthyThreshold(unhealthyThreshold.orNull)
      .build()
}
