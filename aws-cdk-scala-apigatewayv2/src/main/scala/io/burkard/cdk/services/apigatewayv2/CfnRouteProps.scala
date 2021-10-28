package io.burkard.cdk.services.apigatewayv2

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRouteProps {

  def apply(
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
  ): software.amazon.awscdk.services.apigatewayv2.CfnRouteProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnRouteProps.Builder)
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
