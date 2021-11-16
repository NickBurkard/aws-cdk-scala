package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIntegrationResponse {

  def apply(
    internalResourceId: String,
    integrationId: String,
    integrationResponseKey: String,
    apiId: String,
    templateSelectionExpression: Option[String] = None,
    responseParameters: Option[AnyRef] = None,
    contentHandlingStrategy: Option[String] = None,
    responseTemplates: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse =
    software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse.Builder
      .create(stackCtx, internalResourceId)
      .integrationId(integrationId)
      .integrationResponseKey(integrationResponseKey)
      .apiId(apiId)
      .templateSelectionExpression(templateSelectionExpression.orNull)
      .responseParameters(responseParameters.orNull)
      .contentHandlingStrategy(contentHandlingStrategy.orNull)
      .responseTemplates(responseTemplates.orNull)
      .build()
}
