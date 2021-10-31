package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AmplitudeConnectorProfileCredentialsProperty {

  def apply(
    apiKey: Option[String] = None,
    secretKey: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.AmplitudeConnectorProfileCredentialsProperty.Builder)
      .apiKey(apiKey.orNull)
      .secretKey(secretKey.orNull)
      .build()
}
