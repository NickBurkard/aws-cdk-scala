package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SourceFlowConfigProperty {

  def apply(
    connectorProfileName: Option[String] = None,
    sourceConnectorProperties: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceConnectorPropertiesProperty] = None,
    connectorType: Option[String] = None,
    incrementalPullConfig: Option[software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.SourceFlowConfigProperty.Builder)
      .connectorProfileName(connectorProfileName.orNull)
      .sourceConnectorProperties(sourceConnectorProperties.orNull)
      .connectorType(connectorType.orNull)
      .incrementalPullConfig(incrementalPullConfig.orNull)
      .build()
}
