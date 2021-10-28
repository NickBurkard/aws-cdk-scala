package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HealthCheckConfigurationProperty {

  def apply(
    path: Option[String] = None,
    interval: Option[Number] = None,
    timeout: Option[Number] = None,
    protocol: Option[String] = None,
    healthyThreshold: Option[Number] = None,
    unhealthyThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.HealthCheckConfigurationProperty.Builder)
      .path(path.orNull)
      .interval(interval.orNull)
      .timeout(timeout.orNull)
      .protocol(protocol.orNull)
      .healthyThreshold(healthyThreshold.orNull)
      .unhealthyThreshold(unhealthyThreshold.orNull)
      .build()
}
