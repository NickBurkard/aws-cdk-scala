package io.burkard.cdk.services.events

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object EcsTaskProps {

  def apply(
    taskCount: Option[Number] = None,
    containerOverrides: Option[List[_ <: software.amazon.awscdk.services.events.targets.ContainerOverride]] = None,
    subnetSelection: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    platformVersion: Option[software.amazon.awscdk.services.ecs.FargatePlatformVersion] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.ITaskDefinition] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None
  ): software.amazon.awscdk.services.events.targets.EcsTaskProps =
    (new software.amazon.awscdk.services.events.targets.EcsTaskProps.Builder)
      .taskCount(taskCount.orNull)
      .containerOverrides(containerOverrides.map(_.asJava).orNull)
      .subnetSelection(subnetSelection.orNull)
      .cluster(cluster.orNull)
      .platformVersion(platformVersion.orNull)
      .role(role.orNull)
      .taskDefinition(taskDefinition.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .build()
}
