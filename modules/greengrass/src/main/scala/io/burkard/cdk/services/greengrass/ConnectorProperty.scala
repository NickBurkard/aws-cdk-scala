package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectorProperty {

  def apply(
    id: Option[String] = None,
    connectorArn: Option[String] = None,
    parameters: Option[AnyRef] = None
  ): software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty =
    (new software.amazon.awscdk.services.greengrass.CfnConnectorDefinition.ConnectorProperty.Builder)
      .id(id.orNull)
      .connectorArn(connectorArn.orNull)
      .parameters(parameters.orNull)
      .build()
}
