package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SalesforceConnectorProfilePropertiesProperty {

  def apply(
    isSandboxEnvironment: Option[Boolean] = None,
    instanceUrl: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.SalesforceConnectorProfilePropertiesProperty.Builder)
      .isSandboxEnvironment(isSandboxEnvironment.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceUrl(instanceUrl.orNull)
      .build()
}
