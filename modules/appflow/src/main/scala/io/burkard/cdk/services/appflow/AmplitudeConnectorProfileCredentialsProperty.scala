package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AmplitudeConnectorProfileCredentialsProperty {

  def apply(
    apiKey: String,
    secretKey: String
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty.Builder)
      .apiKey(apiKey)
      .secretKey(secretKey)
      .build()
}
