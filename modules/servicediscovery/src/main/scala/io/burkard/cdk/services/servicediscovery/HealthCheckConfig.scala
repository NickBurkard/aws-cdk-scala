package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HealthCheckConfig {

  def apply(
    resourcePath: Option[String] = None,
    failureThreshold: Option[Number] = None,
    `type`: Option[software.amazon.awscdk.services.servicediscovery.HealthCheckType] = None
  ): software.amazon.awscdk.services.servicediscovery.HealthCheckConfig =
    (new software.amazon.awscdk.services.servicediscovery.HealthCheckConfig.Builder)
      .resourcePath(resourcePath.orNull)
      .failureThreshold(failureThreshold.orNull)
      .`type`(`type`.orNull)
      .build()
}
