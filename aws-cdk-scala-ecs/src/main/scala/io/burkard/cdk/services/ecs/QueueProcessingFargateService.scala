package io.burkard.cdk.services.ecs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object QueueProcessingFargateService {

  def apply(
    internalResourceId: String,
    minHealthyPercent: Option[Number] = None,
    visibilityTimeout: Option[software.amazon.awscdk.Duration] = None,
    maxHealthyPercent: Option[Number] = None,
    enableLogging: Option[Boolean] = None,
    taskSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    family: Option[String] = None,
    capacityProviderStrategies: Option[List[_ <: software.amazon.awscdk.services.ecs.CapacityProviderStrategy]] = None,
    maxReceiveCount: Option[Number] = None,
    containerName: Option[String] = None,
    memoryLimitMiB: Option[Number] = None,
    secrets: Option[Map[String, _ <: software.amazon.awscdk.services.ecs.Secret]] = None,
    platformVersion: Option[software.amazon.awscdk.services.ecs.FargatePlatformVersion] = None,
    queue: Option[software.amazon.awscdk.services.sqs.IQueue] = None,
    image: Option[software.amazon.awscdk.services.ecs.ContainerImage] = None,
    retentionPeriod: Option[software.amazon.awscdk.Duration] = None,
    serviceName: Option[String] = None,
    command: Option[List[String]] = None,
    maxScalingCapacity: Option[Number] = None,
    logDriver: Option[software.amazon.awscdk.services.ecs.LogDriver] = None,
    circuitBreaker: Option[software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker] = None,
    scalingSteps: Option[List[_ <: software.amazon.awscdk.services.applicationautoscaling.ScalingInterval]] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    assignPublicIp: Option[Boolean] = None,
    propagateTags: Option[software.amazon.awscdk.services.ecs.PropagatedTagSource] = None,
    enableEcsManagedTags: Option[Boolean] = None,
    cpu: Option[Number] = None,
    environment: Option[Map[String, String]] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    minScalingCapacity: Option[Number] = None,
    deploymentController: Option[software.amazon.awscdk.services.ecs.DeploymentController] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService =
    software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService.Builder
      .create(stackCtx, internalResourceId)
      .minHealthyPercent(minHealthyPercent.orNull)
      .visibilityTimeout(visibilityTimeout.orNull)
      .maxHealthyPercent(maxHealthyPercent.orNull)
      .enableLogging(enableLogging.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .taskSubnets(taskSubnets.orNull)
      .family(family.orNull)
      .capacityProviderStrategies(capacityProviderStrategies.map(_.asJava).orNull)
      .maxReceiveCount(maxReceiveCount.orNull)
      .containerName(containerName.orNull)
      .memoryLimitMiB(memoryLimitMiB.orNull)
      .secrets(secrets.map(_.asJava).orNull)
      .platformVersion(platformVersion.orNull)
      .queue(queue.orNull)
      .image(image.orNull)
      .retentionPeriod(retentionPeriod.orNull)
      .serviceName(serviceName.orNull)
      .command(command.map(_.asJava).orNull)
      .maxScalingCapacity(maxScalingCapacity.orNull)
      .logDriver(logDriver.orNull)
      .circuitBreaker(circuitBreaker.orNull)
      .scalingSteps(scalingSteps.map(_.asJava).orNull)
      .cluster(cluster.orNull)
      .assignPublicIp(assignPublicIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cpu(cpu.orNull)
      .environment(environment.map(_.asJava).orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .minScalingCapacity(minScalingCapacity.orNull)
      .deploymentController(deploymentController.orNull)
      .vpc(vpc.orNull)
      .build()
}
