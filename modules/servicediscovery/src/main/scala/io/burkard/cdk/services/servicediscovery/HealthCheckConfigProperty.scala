package io.burkard.cdk.services.servicediscovery

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object HealthCheckConfigProperty {

  def apply(
    `type`: String,
    resourcePath: Option[String] = None,
    failureThreshold: Option[Number] = None
  ): software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty =
    (new software.amazon.awscdk.services.servicediscovery.CfnService.HealthCheckConfigProperty.Builder)
      .`type`(`type`)
      .resourcePath(resourcePath.orNull)
      .failureThreshold(failureThreshold.orNull)
      .build()
}
