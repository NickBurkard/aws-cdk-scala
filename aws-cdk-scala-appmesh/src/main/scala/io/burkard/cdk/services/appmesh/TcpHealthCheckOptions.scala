package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TcpHealthCheckOptions {

  def apply(
    interval: Option[software.amazon.awscdk.Duration] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    healthyThreshold: Option[Number] = None,
    unhealthyThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions =
    (new software.amazon.awscdk.services.appmesh.TcpHealthCheckOptions.Builder)
      .interval(interval.orNull)
      .timeout(timeout.orNull)
      .healthyThreshold(healthyThreshold.orNull)
      .unhealthyThreshold(unhealthyThreshold.orNull)
      .build()
}
