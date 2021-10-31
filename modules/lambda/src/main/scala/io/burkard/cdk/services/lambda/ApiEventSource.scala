package io.burkard.cdk.services.lambda

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ApiEventSource {

  def apply(
    method: String,
    path: String,
    requestParameters: Option[Map[String, _ <: Boolean]] = None,
    authorizationScopes: Option[List[String]] = None,
    authorizer: Option[software.amazon.awscdk.services.apigateway.IAuthorizer] = None,
    methodResponses: Option[List[_ <: software.amazon.awscdk.services.apigateway.MethodResponse]] = None,
    requestValidatorOptions: Option[software.amazon.awscdk.services.apigateway.RequestValidatorOptions] = None,
    authorizationType: Option[software.amazon.awscdk.services.apigateway.AuthorizationType] = None,
    requestModels: Option[Map[String, _ <: software.amazon.awscdk.services.apigateway.IModel]] = None,
    requestValidator: Option[software.amazon.awscdk.services.apigateway.IRequestValidator] = None,
    operationName: Option[String] = None,
    apiKeyRequired: Option[Boolean] = None
  ): software.amazon.awscdk.services.lambda.eventsources.ApiEventSource =
    software.amazon.awscdk.services.lambda.eventsources.ApiEventSource.Builder
      .create(method, path)
      .requestParameters(requestParameters.map(_.mapValues(Boolean.box).toMap.asJava).orNull)
      .authorizationScopes(authorizationScopes.map(_.asJava).orNull)
      .authorizer(authorizer.orNull)
      .methodResponses(methodResponses.map(_.asJava).orNull)
      .requestValidatorOptions(requestValidatorOptions.orNull)
      .authorizationType(authorizationType.orNull)
      .requestModels(requestModels.map(_.asJava).orNull)
      .requestValidator(requestValidator.orNull)
      .operationName(operationName.orNull)
      .apiKeyRequired(apiKeyRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
