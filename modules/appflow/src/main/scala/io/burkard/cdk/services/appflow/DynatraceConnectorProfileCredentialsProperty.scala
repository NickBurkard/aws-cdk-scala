package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DynatraceConnectorProfileCredentialsProperty {

  def apply(
    apiToken: String
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfileCredentialsProperty.Builder)
      .apiToken(apiToken)
      .build()
}
