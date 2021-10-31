package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ApplicationMultipleTargetGroupsFargateServiceProps {

  def apply(
    memoryLimitMiB: Option[Number] = None,
    healthCheckGracePeriod: Option[software.amazon.awscdk.Duration] = None,
    platformVersion: Option[software.amazon.awscdk.services.ecs.FargatePlatformVersion] = None,
    desiredCount: Option[Number] = None,
    loadBalancers: Option[List[_ <: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps]] = None,
    cpu: Option[Number] = None,
    taskImageOptions: Option[software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.FargateTaskDefinition] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    cloudMapOptions: Option[software.amazon.awscdk.services.ecs.CloudMapOptions] = None,
    targetGroups: Option[List[_ <: software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps]] = None,
    serviceName: Option[String] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    assignPublicIp: Option[Boolean] = None,
    propagateTags: Option[software.amazon.awscdk.services.ecs.PropagatedTagSource] = None,
    enableEcsManagedTags: Option[Boolean] = None
  ): software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps =
    (new software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps.Builder)
      .memoryLimitMiB(memoryLimitMiB.orNull)
      .healthCheckGracePeriod(healthCheckGracePeriod.orNull)
      .platformVersion(platformVersion.orNull)
      .desiredCount(desiredCount.orNull)
      .loadBalancers(loadBalancers.map(_.asJava).orNull)
      .cpu(cpu.orNull)
      .taskImageOptions(taskImageOptions.orNull)
      .taskDefinition(taskDefinition.orNull)
      .vpc(vpc.orNull)
      .cloudMapOptions(cloudMapOptions.orNull)
      .targetGroups(targetGroups.map(_.asJava).orNull)
      .serviceName(serviceName.orNull)
      .cluster(cluster.orNull)
      .assignPublicIp(assignPublicIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .propagateTags(propagateTags.orNull)
      .enableEcsManagedTags(enableEcsManagedTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
