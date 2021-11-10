package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RunEcsFargateTaskProps {

  def apply(
    subnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    containerOverrides: Option[List[_ <: software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverride]] = None,
    platformVersion: Option[software.amazon.awscdk.services.ecs.FargatePlatformVersion] = None,
    integrationPattern: Option[software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern] = None,
    taskDefinition: Option[software.amazon.awscdk.services.ecs.TaskDefinition] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    cluster: Option[software.amazon.awscdk.services.ecs.ICluster] = None,
    assignPublicIp: Option[Boolean] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.RunEcsFargateTaskProps =
    (new software.amazon.awscdk.services.stepfunctions.tasks.RunEcsFargateTaskProps.Builder)
      .subnets(subnets.orNull)
      .containerOverrides(containerOverrides.map(_.asJava).orNull)
      .platformVersion(platformVersion.orNull)
      .integrationPattern(integrationPattern.orNull)
      .taskDefinition(taskDefinition.orNull)
      .securityGroup(securityGroup.orNull)
      .cluster(cluster.orNull)
      .assignPublicIp(assignPublicIp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
