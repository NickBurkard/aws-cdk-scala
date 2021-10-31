package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIntegrationResponse {

  def apply(
    internalResourceId: String,
    templateSelectionExpression: Option[String] = None,
    integrationId: Option[String] = None,
    integrationResponseKey: Option[String] = None,
    responseParameters: Option[AnyRef] = None,
    apiId: Option[String] = None,
    contentHandlingStrategy: Option[String] = None,
    responseTemplates: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse =
    software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponse.Builder
      .create(stackCtx, internalResourceId)
      .templateSelectionExpression(templateSelectionExpression.orNull)
      .integrationId(integrationId.orNull)
      .integrationResponseKey(integrationResponseKey.orNull)
      .responseParameters(responseParameters.orNull)
      .apiId(apiId.orNull)
      .contentHandlingStrategy(contentHandlingStrategy.orNull)
      .responseTemplates(responseTemplates.orNull)
      .build()
}
