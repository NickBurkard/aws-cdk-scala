package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonitoringResourcesProperty {

  def apply(
    clusterConfig: Option[software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.ClusterConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnModelExplainabilityJobDefinition.MonitoringResourcesProperty.Builder)
      .clusterConfig(clusterConfig.orNull)
      .build()
}
