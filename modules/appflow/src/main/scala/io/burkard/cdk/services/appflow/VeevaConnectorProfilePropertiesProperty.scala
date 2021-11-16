package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object VeevaConnectorProfilePropertiesProperty {

  def apply(
    instanceUrl: String
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty.Builder)
      .instanceUrl(instanceUrl)
      .build()
}
