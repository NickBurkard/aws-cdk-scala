package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HealthCheckConfigProperty {

  def apply(
    resourcePath: Option[String] = None,
    failureThreshold: Option[Number] = None,
    `type`: Option[String] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty =
    (new software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty.Builder)
      .resourcePath(resourcePath.orNull)
      .failureThreshold(failureThreshold.orNull)
      .`type`(`type`.orNull)
      .build()
}
