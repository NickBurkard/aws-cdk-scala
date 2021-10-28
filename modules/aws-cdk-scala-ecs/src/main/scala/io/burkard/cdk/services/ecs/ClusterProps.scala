package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClusterProps {

  def apply(
    defaultCloudMapNamespace: Option[software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions] = None,
    enableFargateCapacityProviders: Option[Boolean] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    executeCommandConfiguration: Option[software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration] = None,
    clusterName: Option[String] = None,
    containerInsights: Option[Boolean] = None,
    capacity: Option[software.amazon.awscdk.services.ecs.AddCapacityOptions] = None
  ): software.amazon.awscdk.services.ecs.ClusterProps =
    (new software.amazon.awscdk.services.ecs.ClusterProps.Builder)
      .defaultCloudMapNamespace(defaultCloudMapNamespace.orNull)
      .enableFargateCapacityProviders(enableFargateCapacityProviders.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpc(vpc.orNull)
      .executeCommandConfiguration(executeCommandConfiguration.orNull)
      .clusterName(clusterName.orNull)
      .containerInsights(containerInsights.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .capacity(capacity.orNull)
      .build()
}
