package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIntegrationResponseV2Props {

  def apply(
    templateSelectionExpression: Option[String] = None,
    integrationId: Option[String] = None,
    integrationResponseKey: Option[String] = None,
    responseParameters: Option[AnyRef] = None,
    apiId: Option[String] = None,
    contentHandlingStrategy: Option[String] = None,
    responseTemplates: Option[AnyRef] = None
  ): software.amazon.awscdk.services.apigateway.CfnIntegrationResponseV2Props =
    (new software.amazon.awscdk.services.apigateway.CfnIntegrationResponseV2Props.Builder)
      .templateSelectionExpression(templateSelectionExpression.orNull)
      .integrationId(integrationId.orNull)
      .integrationResponseKey(integrationResponseKey.orNull)
      .responseParameters(responseParameters.orNull)
      .apiId(apiId.orNull)
      .contentHandlingStrategy(contentHandlingStrategy.orNull)
      .responseTemplates(responseTemplates.orNull)
      .build()
}
