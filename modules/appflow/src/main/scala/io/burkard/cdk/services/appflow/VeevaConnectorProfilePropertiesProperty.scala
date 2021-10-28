package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object VeevaConnectorProfilePropertiesProperty {

  def apply(
    instanceUrl: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.VeevaConnectorProfilePropertiesProperty.Builder)
      .instanceUrl(instanceUrl.orNull)
      .build()
}
