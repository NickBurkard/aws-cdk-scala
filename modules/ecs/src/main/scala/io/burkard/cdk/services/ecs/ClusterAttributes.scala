package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusterAttributes {

  def apply(
    securityGroups: List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup],
    clusterName: String,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    hasEc2Capacity: Option[Boolean] = None,
    defaultCloudMapNamespace: Option[software.amazon.awscdk.services.servicediscovery.INamespace] = None,
    clusterArn: Option[String] = None,
    executeCommandConfiguration: Option[software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration] = None,
    autoscalingGroup: Option[software.amazon.awscdk.services.autoscaling.IAutoScalingGroup] = None
  ): software.amazon.awscdk.services.ecs.ClusterAttributes =
    (new software.amazon.awscdk.services.ecs.ClusterAttributes.Builder)
      .securityGroups(securityGroups.asJava)
      .clusterName(clusterName)
      .vpc(vpc)
      .hasEc2Capacity(hasEc2Capacity.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultCloudMapNamespace(defaultCloudMapNamespace.orNull)
      .clusterArn(clusterArn.orNull)
      .executeCommandConfiguration(executeCommandConfiguration.orNull)
      .autoscalingGroup(autoscalingGroup.orNull)
      .build()
}
