package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusterAttributes {

  def apply(
    hasEc2Capacity: Option[Boolean] = None,
    defaultCloudMapNamespace: Option[software.amazon.awscdk.services.servicediscovery.INamespace] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    clusterArn: Option[String] = None,
    executeCommandConfiguration: Option[software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration] = None,
    clusterName: Option[String] = None,
    autoscalingGroup: Option[software.amazon.awscdk.services.autoscaling.IAutoScalingGroup] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None
  ): software.amazon.awscdk.services.ecs.ClusterAttributes =
    (new software.amazon.awscdk.services.ecs.ClusterAttributes.Builder)
      .hasEc2Capacity(hasEc2Capacity.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultCloudMapNamespace(defaultCloudMapNamespace.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .clusterArn(clusterArn.orNull)
      .executeCommandConfiguration(executeCommandConfiguration.orNull)
      .clusterName(clusterName.orNull)
      .autoscalingGroup(autoscalingGroup.orNull)
      .vpc(vpc.orNull)
      .build()
}
