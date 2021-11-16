package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TrendmicroConnectorProfileCredentialsProperty {

  def apply(
    apiSecretKey: String
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.TrendmicroConnectorProfileCredentialsProperty.Builder)
      .apiSecretKey(apiSecretKey)
      .build()
}
