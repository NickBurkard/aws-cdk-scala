package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RunEcsEc2Task {

  def apply(
    subnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    containerOverrides: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride]] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.TaskDefinition] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    placementConstraints: Option[List[_ <: software.amazon.awscdk.services.ecs.PlacementConstraint]] = None,
    placementStrategies: Option[List[_ <: software.amazon.awscdk.services.ecs.PlacementStrategy]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.RunEcsEc2Task =
    software.amazon.awscdk.services.stepfunctions.tasks.RunEcsEc2Task.Builder
      .create()
      .subnets(subnets.orNull)
      .containerOverrides(containerOverrides.map(_.asJava).orNull)
      .cluster(cluster.orNull)
      .integrationPattern(integrationPattern.orNull)
      .taskDefinition(taskDefinition.orNull)
      .securityGroup(securityGroup.orNull)
      .placementConstraints(placementConstraints.map(_.asJava).orNull)
      .placementStrategies(placementStrategies.map(_.asJava).orNull)
      .build()
}
