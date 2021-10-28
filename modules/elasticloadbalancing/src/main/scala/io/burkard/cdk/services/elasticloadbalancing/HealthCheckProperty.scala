package io.burkard.cdk.services.elasticloadbalancing

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HealthCheckProperty {

  def apply(
    interval: Option[String] = None,
    target: Option[String] = None,
    timeout: Option[String] = None,
    healthyThreshold: Option[String] = None,
    unhealthyThreshold: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder)
      .interval(interval.orNull)
      .target(target.orNull)
      .timeout(timeout.orNull)
      .healthyThreshold(healthyThreshold.orNull)
      .unhealthyThreshold(unhealthyThreshold.orNull)
      .build()
}
