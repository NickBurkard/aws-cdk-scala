package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MethodOptions {

  def apply(
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
  ): software.amazon.awscdk.services.apigateway.MethodOptions =
    (new software.amazon.awscdk.services.apigateway.MethodOptions.Builder)
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
