package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationFlowConfigProperty {

  def apply(
    connectorType: String,
    destinationConnectorProperties: software.amazon.awscdk.services.appflow.CfnFlow.DestinationConnectorPropertiesProperty,
    connectorProfileName: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnFlow.DestinationFlowConfigProperty.Builder)
      .connectorType(connectorType)
      .destinationConnectorProperties(destinationConnectorProperties)
      .connectorProfileName(connectorProfileName.orNull)
      .build()
}
