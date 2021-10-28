package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object Cluster {

  def apply(
    internalResourceId: String,
    defaultCloudMapNamespace: Option[software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions] = None,
    enableFargateCapacityProviders: Option[Boolean] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    executeCommandConfiguration: Option[software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration] = None,
    clusterName: Option[String] = None,
    containerInsights: Option[Boolean] = None,
    capacity: Option[software.amazon.awscdk.services.ecs.AddCapacityOptions] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecs.Cluster =
    software.amazon.awscdk.services.ecs.Cluster.Builder
      .create(stackCtx, internalResourceId)
      .defaultCloudMapNamespace(defaultCloudMapNamespace.orNull)
      .enableFargateCapacityProviders(enableFargateCapacityProviders.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .vpc(vpc.orNull)
      .executeCommandConfiguration(executeCommandConfiguration.orNull)
      .clusterName(clusterName.orNull)
      .containerInsights(containerInsights.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .capacity(capacity.orNull)
      .build()
}
