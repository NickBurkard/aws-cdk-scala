package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Ec2ServiceProps {

  def apply(
    taskDefinition: software.amazon.awscdk.services.ecs.TaskDefinition,
    minHealthyPercent: Option[Number] = None,
    healthCheckGracePeriod: Option[software.amazon.awscdk.Duration] = None,
    desiredCount: Option[Number] = None,
    serviceName: Option[String] = None,
    maxHealthyPercent: Option[Number] = None,
    deploymentController: Option[software.amazon.awscdk.services.ecs.DeploymentController] = None,
    cloudMapOptions: Option[software.amazon.awscdk.services.ecs.CloudMapOptions] = None,
    capacityProviderStrategies: Option[List[_ <: software.amazon.awscdk.services.ecs.CapacityProviderStrategy]] = None,
    daemon: Option[Boolean] = None,
    enableExecuteCommand: Option[Boolean] = None,
    circuitBreaker: Option[software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    assignPublicIp: Option[Boolean] = None,
    propagateTags: Option[software.amazon.awscdk.services.ecs.PropagatedTagSource] = None,
    enableEcsManagedTags: Option[Boolean] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    placementConstraints: Option[List[_ <: software.amazon.awscdk.services.ecs.PlacementConstraint]] = None,
    placementStrategies: Option[List[_ <: software.amazon.awscdk.services.ecs.PlacementStrategy]] = None
  ): software.amazon.awscdk.services.ecs.Ec2ServiceProps =
    (new software.amazon.awscdk.services.ecs.Ec2ServiceProps.Builder)
      .taskDefinition(taskDefinition)
      .minHealthyPercent(minHealthyPercent.orNull)
      .healthCheckGracePeriod(healthCheckGracePeriod.orNull)
      .desiredCount(desiredCount.orNull)
      .serviceName(serviceName.orNull)
      .maxHealthyPercent(maxHealthyPercent.orNull)
      .deploymentController(deploymentController.orNull)
      .cloudMapOptions(cloudMapOptions.orNull)
      .capacityProviderStrategies(capacityProviderStrategies.map(_.asJava).orNull)
      .daemon(daemon.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enableExecuteCommand(enableExecuteCommand.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .circuitBreaker(circuitBreaker.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .cluster(cluster.orNull)
      .assignPublicIp(assignPublicIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .placementConstraints(placementConstraints.map(_.asJava).orNull)
      .placementStrategies(placementStrategies.map(_.asJava).orNull)
      .build()
}
