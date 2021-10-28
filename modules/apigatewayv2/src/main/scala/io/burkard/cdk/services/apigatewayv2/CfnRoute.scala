package io.burkard.cdk.services.apigatewayv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRoute {

  def apply(
    internalResourceId: String,
    requestParameters: Option[AnyRef] = None,
    authorizationScopes: Option[List[String]] = None,
    routeResponseSelectionExpression: Option[String] = None,
    authorizerId: Option[String] = None,
    authorizationType: Option[String] = None,
    requestModels: Option[AnyRef] = None,
    apiId: Option[String] = None,
    routeKey: Option[String] = None,
    target: Option[String] = None,
    modelSelectionExpression: Option[String] = None,
    operationName: Option[String] = None,
    apiKeyRequired: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnRoute =
    software.amazon.awscdk.services.apigatewayv2.CfnRoute.Builder
      .create(stackCtx, internalResourceId)
      .requestParameters(requestParameters.orNull)
      .authorizationScopes(authorizationScopes.map(_.asJava).orNull)
      .routeResponseSelectionExpression(routeResponseSelectionExpression.orNull)
      .authorizerId(authorizerId.orNull)
      .authorizationType(authorizationType.orNull)
      .requestModels(requestModels.orNull)
      .apiId(apiId.orNull)
      .routeKey(routeKey.orNull)
      .target(target.orNull)
      .modelSelectionExpression(modelSelectionExpression.orNull)
      .operationName(operationName.orNull)
      .apiKeyRequired(apiKeyRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
