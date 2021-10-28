package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnConnectorProfile {

  def apply(
    internalResourceId: String,
    connectorType: Option[String] = None,
    kmsArn: Option[String] = None,
    connectionMode: Option[String] = None,
    connectorProfileName: Option[String] = None,
    connectorProfileConfig: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appflow.CfnConnectorProfile =
    software.amazon.awscdk.services.appflow.CfnConnectorProfile.Builder
      .create(stackCtx, internalResourceId)
      .connectorType(connectorType.orNull)
      .kmsArn(kmsArn.orNull)
      .connectionMode(connectionMode.orNull)
      .connectorProfileName(connectorProfileName.orNull)
      .connectorProfileConfig(connectorProfileConfig.orNull)
      .build()
}
