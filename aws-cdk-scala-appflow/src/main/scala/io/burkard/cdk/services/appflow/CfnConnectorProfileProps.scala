package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConnectorProfileProps {

  def apply(
    connectorType: Option[String] = None,
    kmsArn: Option[String] = None,
    connectionMode: Option[String] = None,
    connectorProfileName: Option[String] = None,
    connectorProfileConfig: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfileProps =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfileProps.Builder)
      .connectorType(connectorType.orNull)
      .kmsArn(kmsArn.orNull)
      .connectionMode(connectionMode.orNull)
      .connectorProfileName(connectorProfileName.orNull)
      .connectorProfileConfig(connectorProfileConfig.orNull)
      .build()
}
