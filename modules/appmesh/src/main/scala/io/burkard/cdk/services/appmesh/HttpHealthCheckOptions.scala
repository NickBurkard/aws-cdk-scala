package io.burkard.cdk.services.appmesh

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HttpHealthCheckOptions {

  def apply(
    path: Option[String] = None,
    interval: Option[software.amazon.awscdk.Duration] = None,
    timeout: Option[software.amazon.awscdk.Duration] = None,
    healthyThreshold: Option[Number] = None,
    unhealthyThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions =
    (new software.amazon.awscdk.services.appmesh.HttpHealthCheckOptions.Builder)
      .path(path.orNull)
      .interval(interval.orNull)
      .timeout(timeout.orNull)
      .healthyThreshold(healthyThreshold.orNull)
      .unhealthyThreshold(unhealthyThreshold.orNull)
      .build()
}
