package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SourceFlowConfigProperty {

  def apply(
    connectorProfileName: Option[String] = None,
    sourceConnectorProperties: Option[software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty] = None,
    connectorType: Option[String] = None,
    incrementalPullConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty.Builder)
      .connectorProfileName(connectorProfileName.orNull)
      .sourceConnectorProperties(sourceConnectorProperties.orNull)
      .connectorType(connectorType.orNull)
      .incrementalPullConfig(incrementalPullConfig.orNull)
      .build()
}
