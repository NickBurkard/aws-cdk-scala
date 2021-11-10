package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SAPODataConnectorProfileCredentialsProperty {

  def apply(
    basicAuthCredentials: Option[AnyRef] = None,
    oAuthCredentials: Option[AnyRef] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfileCredentialsProperty.Builder)
      .basicAuthCredentials(basicAuthCredentials.orNull)
      .oAuthCredentials(oAuthCredentials.orNull)
      .build()
}
