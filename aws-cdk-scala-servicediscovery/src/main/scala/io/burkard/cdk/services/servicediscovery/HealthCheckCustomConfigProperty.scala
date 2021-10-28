package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object HealthCheckCustomConfigProperty {

  def apply(
    failureThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty =
    (new software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckCustomConfigProperty.Builder)
      .failureThreshold(failureThreshold.orNull)
      .build()
}
