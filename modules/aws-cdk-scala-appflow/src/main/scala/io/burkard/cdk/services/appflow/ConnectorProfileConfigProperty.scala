package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConnectorProfileConfigProperty {

  def apply(
    connectorProfileCredentials: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileCredentialsProperty] = None,
    connectorProfileProperties: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfilePropertiesProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty.Builder)
      .connectorProfileCredentials(connectorProfileCredentials.orNull)
      .connectorProfileProperties(connectorProfileProperties.orNull)
      .build()
}
