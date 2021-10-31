package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IntegrationOverridesProperty {

  def apply(
    timeoutInMillis: Option[Number] = None,
    description: Option[String] = None,
    integrationMethod: Option[String] = None,
    payloadFormatVersion: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.Builder)
      .timeoutInMillis(timeoutInMillis.orNull)
      .description(description.orNull)
      .integrationMethod(integrationMethod.orNull)
      .payloadFormatVersion(payloadFormatVersion.orNull)
      .build()
}
