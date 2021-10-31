package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BaseServiceOptions {

  def apply(
    minHealthyPercent: Option[Number] = None,
    healthCheckGracePeriod: Option[software.amazon.awscdk.Duration] = None,
    desiredCount: Option[Number] = None,
    serviceName: Option[String] = None,
    enableExecuteCommand: Option[Boolean] = None,
    maxHealthyPercent: Option[Number] = None,
    circuitBreaker: Option[software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    deploymentController: Option[software.amazon.awscdk.services.ecs.DeploymentController] = None,
    cloudMapOptions: Option[software.amazon.awscdk.services.ecs.CloudMapOptions] = None,
    capacityProviderStrategies: Option[List[_ <: software.amazon.awscdk.services.ecs.CapacityProviderStrategy]] = None,
    propagateTags: Option[software.amazon.awscdk.services.ecs.PropagatedTagSource] = None,
    enableEcsManagedTags: Option[Boolean] = None
  ): software.amazon.awscdk.services.ecs.BaseServiceOptions =
    (new software.amazon.awscdk.services.ecs.BaseServiceOptions.Builder)
      .minHealthyPercent(minHealthyPercent.orNull)
      .healthCheckGracePeriod(healthCheckGracePeriod.orNull)
      .desiredCount(desiredCount.orNull)
      .serviceName(serviceName.orNull)
      .enableExecuteCommand(enableExecuteCommand.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .maxHealthyPercent(maxHealthyPercent.orNull)
      .circuitBreaker(circuitBreaker.orNull)
      .cluster(cluster.orNull)
      .deploymentController(deploymentController.orNull)
      .cloudMapOptions(cloudMapOptions.orNull)
      .capacityProviderStrategies(capacityProviderStrategies.map(_.asJava).orNull)
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
