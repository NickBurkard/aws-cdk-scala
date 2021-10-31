package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIntegrationProps {

  def apply(
    integrationUri: Option[String] = None,
    requestParameters: Option[AnyRef] = None,
    timeoutInMillis: Option[Number] = None,
    templateSelectionExpression: Option[String] = None,
    description: Option[String] = None,
    responseParameters: Option[AnyRef] = None,
    apiId: Option[String] = None,
    connectionId: Option[String] = None,
    credentialsArn: Option[String] = None,
    contentHandlingStrategy: Option[String] = None,
    passthroughBehavior: Option[String] = None,
    connectionType: Option[String] = None,
    integrationMethod: Option[String] = None,
    tlsConfig: Option[software.amazon.awscdk.services.apigatewayv2.CfnIntegration.TlsConfigProperty] = None,
    integrationSubtype: Option[String] = None,
    requestTemplates: Option[AnyRef] = None,
    integrationType: Option[String] = None,
    payloadFormatVersion: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnIntegrationProps.Builder)
      .integrationUri(integrationUri.orNull)
      .requestParameters(requestParameters.orNull)
      .timeoutInMillis(timeoutInMillis.orNull)
      .templateSelectionExpression(templateSelectionExpression.orNull)
      .description(description.orNull)
      .responseParameters(responseParameters.orNull)
      .apiId(apiId.orNull)
      .connectionId(connectionId.orNull)
      .credentialsArn(credentialsArn.orNull)
      .contentHandlingStrategy(contentHandlingStrategy.orNull)
      .passthroughBehavior(passthroughBehavior.orNull)
      .connectionType(connectionType.orNull)
      .integrationMethod(integrationMethod.orNull)
      .tlsConfig(tlsConfig.orNull)
      .integrationSubtype(integrationSubtype.orNull)
      .requestTemplates(requestTemplates.orNull)
      .integrationType(integrationType.orNull)
      .payloadFormatVersion(payloadFormatVersion.orNull)
      .build()
}
