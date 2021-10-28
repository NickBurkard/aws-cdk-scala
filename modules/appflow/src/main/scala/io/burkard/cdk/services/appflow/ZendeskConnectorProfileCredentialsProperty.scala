package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ZendeskConnectorProfileCredentialsProperty {

  def apply(
    clientId: Option[String] = None,
    clientSecret: Option[String] = None,
    connectorOAuthRequest: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty] = None,
    accessToken: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.ZendeskConnectorProfileCredentialsProperty.Builder)
      .clientId(clientId.orNull)
      .clientSecret(clientSecret.orNull)
      .connectorOAuthRequest(connectorOAuthRequest.orNull)
      .accessToken(accessToken.orNull)
      .build()
}
