package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceFlowConfigProperty {

  def apply(
    sourceConnectorProperties: software.amazon.awscdk.services.appflow.CfnFlow.SourceConnectorPropertiesProperty,
    connectorType: String,
    connectorProfileName: Option[String] = None,
    incrementalPullConfig: Option[software.amazon.awscdk.services.appflow.CfnFlow.IncrementalPullConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.SourceFlowConfigProperty.Builder)
      .sourceConnectorProperties(sourceConnectorProperties)
      .connectorType(connectorType)
      .connectorProfileName(connectorProfileName.orNull)
      .incrementalPullConfig(incrementalPullConfig.orNull)
      .build()
}
