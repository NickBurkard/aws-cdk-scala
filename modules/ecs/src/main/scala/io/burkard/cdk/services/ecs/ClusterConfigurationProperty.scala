package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ClusterConfigurationProperty {

  def apply(
    executeCommandConfiguration: Option[software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty] = None
  ): software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty.Builder)
      .executeCommandConfiguration(executeCommandConfiguration.orNull)
      .build()
}
