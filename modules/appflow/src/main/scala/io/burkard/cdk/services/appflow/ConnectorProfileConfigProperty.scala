package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ConnectorProfileConfigProperty {

  def apply(
    connectorProfileCredentials: software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty,
    connectorProfileProperties: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty.Builder)
      .connectorProfileCredentials(connectorProfileCredentials)
      .connectorProfileProperties(connectorProfileProperties.orNull)
      .build()
}
