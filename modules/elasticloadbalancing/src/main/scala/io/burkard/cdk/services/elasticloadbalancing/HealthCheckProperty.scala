package io.burkard.cdk.services.elasticloadbalancing

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HealthCheckProperty {

  def apply(
    interval: String,
    target: String,
    timeout: String,
    healthyThreshold: String,
    unhealthyThreshold: String
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder)
      .interval(interval)
      .target(target)
      .timeout(timeout)
      .healthyThreshold(healthyThreshold)
      .unhealthyThreshold(unhealthyThreshold)
      .build()
}
