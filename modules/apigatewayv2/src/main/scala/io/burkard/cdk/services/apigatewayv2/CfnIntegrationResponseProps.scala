package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIntegrationResponseProps {

  def apply(
    integrationId: String,
    integrationResponseKey: String,
    apiId: String,
    templateSelectionExpression: Option[String] = None,
    responseParameters: Option[AnyRef] = None,
    contentHandlingStrategy: Option[String] = None,
    responseTemplates: Option[AnyRef] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnIntegrationResponseProps.Builder)
      .integrationId(integrationId)
      .integrationResponseKey(integrationResponseKey)
      .apiId(apiId)
      .templateSelectionExpression(templateSelectionExpression.orNull)
      .responseParameters(responseParameters.orNull)
      .contentHandlingStrategy(contentHandlingStrategy.orNull)
      .responseTemplates(responseTemplates.orNull)
      .build()
}
