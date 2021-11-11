package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnIntegrationV2 {

  def apply(
    internalResourceId: String,
    integrationUri: Option[String] = None,
    requestParameters: Option[AnyRef] = None,
    timeoutInMillis: Option[Number] = None,
    templateSelectionExpression: Option[String] = None,
    description: Option[String] = None,
    integrationMethod: Option[String] = None,
    requestTemplates: Option[AnyRef] = None,
    apiId: Option[String] = None,
    credentialsArn: Option[String] = None,
    contentHandlingStrategy: Option[String] = None,
    passthroughBehavior: Option[String] = None,
    connectionType: Option[String] = None,
    integrationType: Option[String] = None,
    payloadFormatVersion: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnIntegrationV2 =
    software.amazon.awscdk.services.apigateway.CfnIntegrationV2.Builder
      .create(stackCtx, internalResourceId)
      .integrationUri(integrationUri.orNull)
      .requestParameters(requestParameters.orNull)
      .timeoutInMillis(timeoutInMillis.orNull)
      .templateSelectionExpression(templateSelectionExpression.orNull)
      .description(description.orNull)
      .integrationMethod(integrationMethod.orNull)
      .requestTemplates(requestTemplates.orNull)
      .apiId(apiId.orNull)
      .credentialsArn(credentialsArn.orNull)
      .contentHandlingStrategy(contentHandlingStrategy.orNull)
      .passthroughBehavior(passthroughBehavior.orNull)
      .connectionType(connectionType.orNull)
      .integrationType(integrationType.orNull)
      .payloadFormatVersion(payloadFormatVersion.orNull)
      .build()
}
