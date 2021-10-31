package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DynatraceConnectorProfilePropertiesProperty {

  def apply(
    instanceUrl: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.DynatraceConnectorProfilePropertiesProperty.Builder)
      .instanceUrl(instanceUrl.orNull)
      .build()
}
