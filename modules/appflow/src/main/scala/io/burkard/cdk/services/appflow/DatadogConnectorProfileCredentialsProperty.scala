package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatadogConnectorProfileCredentialsProperty {

  def apply(
    applicationKey: String,
    apiKey: String
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.DatadogConnectorProfileCredentialsProperty.Builder)
      .applicationKey(applicationKey)
      .apiKey(apiKey)
      .build()
}
