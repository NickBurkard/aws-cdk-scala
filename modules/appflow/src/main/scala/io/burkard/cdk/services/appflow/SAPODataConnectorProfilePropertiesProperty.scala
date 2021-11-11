package io.burkard.cdk.services.appflow

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object SAPODataConnectorProfilePropertiesProperty {

  def apply(
    clientNumber: Option[String] = None,
    applicationHostUrl: Option[String] = None,
    logonLanguage: Option[String] = None,
    oAuthProperties: Option[software.amazon.awscdk.services.appflow.CfnConnectorProfile.OAuthPropertiesProperty] = None,
    portNumber: Option[Number] = None,
    privateLinkServiceName: Option[String] = None,
    applicationServicePath: Option[String] = None
  ): software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty =
    (new software.amazon.awscdk.services.appflow.CfnConnectorProfile.SAPODataConnectorProfilePropertiesProperty.Builder)
      .clientNumber(clientNumber.orNull)
      .applicationHostUrl(applicationHostUrl.orNull)
      .logonLanguage(logonLanguage.orNull)
      .oAuthProperties(oAuthProperties.orNull)
      .portNumber(portNumber.orNull)
      .privateLinkServiceName(privateLinkServiceName.orNull)
      .applicationServicePath(applicationServicePath.orNull)
      .build()
}
