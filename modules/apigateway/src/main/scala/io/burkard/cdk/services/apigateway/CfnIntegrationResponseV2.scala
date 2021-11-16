package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIntegrationResponseV2 {

  def apply(
    internalResourceId: String,
    integrationId: String,
    integrationResponseKey: String,
    apiId: String,
    templateSelectionExpression: Option[String] = None,
    responseParameters: Option[AnyRef] = None,
    contentHandlingStrategy: Option[String] = None,
    responseTemplates: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnIntegrationResponseV2 =
    software.amazon.awscdk.services.apigateway.CfnIntegrationResponseV2.Builder
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
