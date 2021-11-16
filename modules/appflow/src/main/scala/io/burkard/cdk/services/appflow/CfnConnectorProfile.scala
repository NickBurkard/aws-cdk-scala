package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnConnectorProfile {

  def apply(
    internalResourceId: String,
    connectorType: String,
    connectionMode: String,
    connectorProfileName: String,
    kmsArn: Option[String] = None,
    connectorProfileConfig: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorProfileConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.appflow.CfnConnectorProfile =
    software.amazon.awscdk.services.appflow.CfnConnectorProfile.Builder
      .create(stackCtx, internalResourceId)
      .connectorType(connectorType)
      .connectionMode(connectionMode)
      .connectorProfileName(connectorProfileName)
      .kmsArn(kmsArn.orNull)
      .connectorProfileConfig(connectorProfileConfig.orNull)
      .build()
}
