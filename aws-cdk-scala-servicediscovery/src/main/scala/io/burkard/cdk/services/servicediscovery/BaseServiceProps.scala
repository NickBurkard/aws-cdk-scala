package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BaseServiceProps {

  def apply(
    healthCheck: Option[software.amazon.awscdk.services.servicediscovery.HealthCheckConfig] = None,
    name: Option[String] = None,
    description: Option[String] = None,
    customHealthCheck: Option[software.amazon.awscdk.services.servicediscovery.HealthCheckCustomConfig] = None
  ): software.amazon.awscdk.services.servicediscovery.BaseServiceProps =
    (new software.amazon.awscdk.services.servicediscovery.BaseServiceProps.Builder)
      .healthCheck(healthCheck.orNull)
      .name(name.orNull)
      .description(description.orNull)
      .customHealthCheck(customHealthCheck.orNull)
      .build()
}
