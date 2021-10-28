package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HealthCheckCustomConfig {

  def apply(
    failureThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig =
    (new software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig.Builder)
      .failureThreshold(failureThreshold.orNull)
      .build()
}
