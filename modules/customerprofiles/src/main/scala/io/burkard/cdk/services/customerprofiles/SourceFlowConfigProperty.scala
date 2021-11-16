package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceFlowConfigProperty {

  def apply(
    sourceConnectorProperties: software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty,
    connectorType: String,
    connectorProfileName: Option[String] = None,
    incrementalPullConfig: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty.Builder)
      .sourceConnectorProperties(sourceConnectorProperties)
      .connectorType(connectorType)
      .connectorProfileName(connectorProfileName.orNull)
      .incrementalPullConfig(incrementalPullConfig.orNull)
      .build()
}
