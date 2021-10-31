package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationFlowConfigProperty {

  def apply(
    connectorProfileName: Option[String] = None,
    connectorType: Option[String] = None,
    destinationConnectorProperties: Option[software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty.Builder)
      .connectorProfileName(connectorProfileName.orNull)
      .connectorType(connectorType.orNull)
      .destinationConnectorProperties(destinationConnectorProperties.orNull)
      .build()
}
