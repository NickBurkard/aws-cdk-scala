package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SlackConnectorProfilePropertiesProperty {

  def apply(
    instanceUrl: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.SlackConnectorProfilePropertiesProperty.Builder)
      .instanceUrl(instanceUrl.orNull)
      .build()
}
