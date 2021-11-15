package io.burkard.cdk.services.sagemaker

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MonitoringResourcesProperty {

  def apply(
    clusterConfig: Option[software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.ClusterConfigProperty] = None
  ): software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringResourcesProperty =
    (new software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition.MonitoringResourcesProperty.Builder)
      .clusterConfig(clusterConfig.orNull)
      .build()
}
