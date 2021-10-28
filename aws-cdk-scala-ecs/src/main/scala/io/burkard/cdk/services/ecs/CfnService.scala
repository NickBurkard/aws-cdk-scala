package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnService {

  def apply(
    internalResourceId: String,
    capacityProviderStrategy: Option[List[_]] = None,
    networkConfiguration: Option[software.amazon.awscdk.services.ecs.CfnService.NetworkConfigurationProperty] = None,
    serviceName: Option[String] = None,
    enableExecuteCommand: Option[Boolean] = None,
    launchType: Option[String] = None,
    loadBalancers: Option[List[_]] = None,
    cluster: Option[String] = None,
    healthCheckGracePeriodSeconds: Option[Number] = None,
    taskDefinition: Option[String] = None,
    deploymentController: Option[software.amazon.awscdk.services.ecs.CfnService.DeploymentControllerProperty] = None,
    serviceRegistries: Option[List[_]] = None,
    schedulingStrategy: Option[String] = None,
    platformVersion: Option[String] = None,
    role: Option[String] = None,
    desiredCount: Option[Number] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    propagateTags: Option[String] = None,
    enableEcsManagedTags: Option[Boolean] = None,
    deploymentConfiguration: Option[software.amazon.awscdk.services.ecs.CfnService.DeploymentConfigurationProperty] = None,
    placementConstraints: Option[List[_]] = None,
    placementStrategies: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.CfnService =
    software.amazon.awscdk.services.ecs.CfnService.Builder
      .create(stackCtx, internalResourceId)
      .capacityProviderStrategy(capacityProviderStrategy.map(_.asJava).orNull)
      .networkConfiguration(networkConfiguration.orNull)
      .serviceName(serviceName.orNull)
      .enableExecuteCommand(enableExecuteCommand.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .launchType(launchType.orNull)
      .loadBalancers(loadBalancers.map(_.asJava).orNull)
      .cluster(cluster.orNull)
      .healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds.orNull)
      .taskDefinition(taskDefinition.orNull)
      .deploymentController(deploymentController.orNull)
      .serviceRegistries(serviceRegistries.map(_.asJava).orNull)
      .schedulingStrategy(schedulingStrategy.orNull)
      .platformVersion(platformVersion.orNull)
      .role(role.orNull)
      .desiredCount(desiredCount.orNull)
      .tags(tags.map(_.asJava).orNull)
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deploymentConfiguration(deploymentConfiguration.orNull)
      .placementConstraints(placementConstraints.map(_.asJava).orNull)
      .placementStrategies(placementStrategies.map(_.asJava).orNull)
      .build()
}
