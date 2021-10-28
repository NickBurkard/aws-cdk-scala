package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DeploymentConfigurationProperty {

  def apply(
    minimumHealthyPercent: Option[Number] = None,
    deploymentCircuitBreaker: Option[software.amazon.awscdk.services.ecs.CfnService.DeploymentCircuitBreakerProperty] = None,
    maximumPercent: Option[Number] = None
  ): software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty.Builder)
      .minimumHealthyPercent(minimumHealthyPercent.orNull)
      .deploymentCircuitBreaker(deploymentCircuitBreaker.orNull)
      .maximumPercent(maximumPercent.orNull)
      .build()
}
