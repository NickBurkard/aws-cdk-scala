package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object GoogleAnalyticsConnectorProfileCredentialsProperty {

  def apply(
    clientId: String,
    clientSecret: String,
    connectorOAuthRequest: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty] = None,
    refreshToken: Option[String] = None,
    accessToken: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.GoogleAnalyticsConnectorProfileCredentialsProperty.Builder)
      .clientId(clientId)
      .clientSecret(clientSecret)
      .connectorOAuthRequest(connectorOAuthRequest.orNull)
      .refreshToken(refreshToken.orNull)
      .accessToken(accessToken.orNull)
      .build()
}
