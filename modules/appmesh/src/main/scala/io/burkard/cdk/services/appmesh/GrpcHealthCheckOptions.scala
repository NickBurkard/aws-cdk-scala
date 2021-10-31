package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GrpcHealthCheckOptions {

  def apply(
    interval: Option[software.amazon.awscdk.Duration] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    healthyThreshold: Option[Number] = None,
    unhealthyThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.GrpcHealthCheckOptions =
    (new software.amazon.awscdk.services.appmesh.GrpcHealthCheckOptions.Builder)
      .interval(interval.orNull)
      .timeout(timeout.orNull)
      .healthyThreshold(healthyThreshold.orNull)
      .unhealthyThreshold(unhealthyThreshold.orNull)
      .build()
}
