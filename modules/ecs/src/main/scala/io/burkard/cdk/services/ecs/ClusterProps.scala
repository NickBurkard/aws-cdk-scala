package io.burkard.cdk.services.ecs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusterProps {

  def apply(
    capacityProviders: Option[List[String]] = None,
    defaultCloudMapNamespace: Option[software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions] = None,
    enableFargateCapacityProviders: Option[Boolean] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    executeCommandConfiguration: Option[software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration] = None,
    clusterName: Option[String] = None,
    containerInsights: Option[Boolean] = None,
    capacity: Option[software.amazon.awscdk.services.ecs.AddCapacityOptions] = None
  ): software.amazon.awscdk.services.ecs.ClusterProps =
    (new software.amazon.awscdk.services.ecs.ClusterProps.Builder)
      .capacityProviders(capacityProviders.map(_.asJava).orNull)
      .defaultCloudMapNamespace(defaultCloudMapNamespace.orNull)
      .enableFargateCapacityProviders(enableFargateCapacityProviders.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpc(vpc.orNull)
      .executeCommandConfiguration(executeCommandConfiguration.orNull)
      .clusterName(clusterName.orNull)
      .containerInsights(containerInsights.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .capacity(capacity.orNull)
      .build()
}
