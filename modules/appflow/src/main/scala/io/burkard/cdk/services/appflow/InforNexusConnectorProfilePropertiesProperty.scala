package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InforNexusConnectorProfilePropertiesProperty {

  def apply(
    instanceUrl: String
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.InforNexusConnectorProfilePropertiesProperty.Builder)
      .instanceUrl(instanceUrl)
      .build()
}
