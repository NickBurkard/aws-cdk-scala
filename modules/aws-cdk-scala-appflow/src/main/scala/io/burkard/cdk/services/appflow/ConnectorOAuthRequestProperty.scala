package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ConnectorOAuthRequestProperty {

  def apply(
    redirectUri: Option[String] = None,
    authCode: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.ConnectorOAuthRequestProperty.Builder)
      .redirectUri(redirectUri.orNull)
      .authCode(authCode.orNull)
      .build()
}
