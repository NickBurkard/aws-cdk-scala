package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectorProperty {

  def apply(
    id: String,
    connectorArn: String,
    parameters: Option[AnyRef] = None
  ): software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty =
    (new software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion.ConnectorProperty.Builder)
      .id(id)
      .connectorArn(connectorArn)
      .parameters(parameters.orNull)
      .build()
}
