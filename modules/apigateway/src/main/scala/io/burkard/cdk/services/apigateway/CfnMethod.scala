package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMethod {

  def apply(
    internalResourceId: String,
    resourceId: String,
    httpMethod: String,
    restApiId: String,
    requestParameters: Option[Map[String, _]] = None,
    authorizationScopes: Option[List[String]] = None,
    requestValidatorId: Option[String] = None,
    integration: Option[software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty] = None,
    methodResponses: Option[List[_]] = None,
    authorizerId: Option[String] = None,
    authorizationType: Option[String] = None,
    requestModels: Option[Map[String, String]] = None,
    operationName: Option[String] = None,
    apiKeyRequired: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnMethod =
    software.amazon.awscdk.services.apigateway.CfnMethod.Builder
      .create(stackCtx, internalResourceId)
      .resourceId(resourceId)
      .httpMethod(httpMethod)
      .restApiId(restApiId)
      .requestParameters(requestParameters.map(_.asJava).orNull)
      .authorizationScopes(authorizationScopes.map(_.asJava).orNull)
      .requestValidatorId(requestValidatorId.orNull)
      .integration(integration.orNull)
      .methodResponses(methodResponses.map(_.asJava).orNull)
      .authorizerId(authorizerId.orNull)
      .authorizationType(authorizationType.orNull)
      .requestModels(requestModels.map(_.asJava).orNull)
      .operationName(operationName.orNull)
      .apiKeyRequired(apiKeyRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
