package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SalesforceConnectorProfileCredentialsProperty {

  def apply(
    connectorOAuthRequest: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty] = None,
    clientCredentialsArn: Option[String] = None,
    refreshToken: Option[String] = None,
    accessToken: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfileCredentialsProperty.Builder)
      .connectorOAuthRequest(connectorOAuthRequest.orNull)
      .clientCredentialsArn(clientCredentialsArn.orNull)
      .refreshToken(refreshToken.orNull)
      .accessToken(accessToken.orNull)
      .build()
}
