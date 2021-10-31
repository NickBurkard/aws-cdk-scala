package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMethod {

  def apply(
    internalResourceId: String,
    resourceId: Option[String] = None,
    requestParameters: Option[Map[String, _]] = None,
    authorizationScopes: Option[List[String]] = None,
    requestValidatorId: Option[String] = None,
    integration: Option[software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty] = None,
    httpMethod: Option[String] = None,
    methodResponses: Option[List[_]] = None,
    authorizerId: Option[String] = None,
    authorizationType: Option[String] = None,
    requestModels: Option[Map[String, String]] = None,
    operationName: Option[String] = None,
    restApiId: Option[String] = None,
    apiKeyRequired: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnMethod =
    software.amazon.awscdk.services.apigateway.CfnMethod.Builder
      .create(stackCtx, internalResourceId)
      .resourceId(resourceId.orNull)
      .requestParameters(requestParameters.map(_.asJava).orNull)
      .authorizationScopes(authorizationScopes.map(_.asJava).orNull)
      .requestValidatorId(requestValidatorId.orNull)
      .integration(integration.orNull)
      .httpMethod(httpMethod.orNull)
      .methodResponses(methodResponses.map(_.asJava).orNull)
      .authorizerId(authorizerId.orNull)
      .authorizationType(authorizationType.orNull)
      .requestModels(requestModels.map(_.asJava).orNull)
      .operationName(operationName.orNull)
      .restApiId(restApiId.orNull)
      .apiKeyRequired(apiKeyRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
