package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnectorProfileProps {

  def apply(
    connectorType: String,
    connectionMode: String,
    connectorProfileName: String,
    kmsArn: Option[String] = None,
    connectorProfileConfig: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfileProps =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfileProps.Builder)
      .connectorType(connectorType)
      .connectionMode(connectionMode)
      .connectorProfileName(connectorProfileName)
      .kmsArn(kmsArn.orNull)
      .connectorProfileConfig(connectorProfileConfig.orNull)
      .build()
}
