package io.burkard.cdk.services.apigatewayv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteProps {

  def apply(
    apiId: String,
    routeKey: String,
    requestParameters: Option[AnyRef] = None,
    authorizationScopes: Option[List[String]] = None,
    routeResponseSelectionExpression: Option[String] = None,
    authorizerId: Option[String] = None,
    authorizationType: Option[String] = None,
    requestModels: Option[AnyRef] = None,
    target: Option[String] = None,
    modelSelectionExpression: Option[String] = None,
    operationName: Option[String] = None,
    apiKeyRequired: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnRouteProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnRouteProps.Builder)
      .apiId(apiId)
      .routeKey(routeKey)
      .requestParameters(requestParameters.orNull)
      .authorizationScopes(authorizationScopes.map(_.asJava).orNull)
      .routeResponseSelectionExpression(routeResponseSelectionExpression.orNull)
      .authorizerId(authorizerId.orNull)
      .authorizationType(authorizationType.orNull)
      .requestModels(requestModels.orNull)
      .target(target.orNull)
      .modelSelectionExpression(modelSelectionExpression.orNull)
      .operationName(operationName.orNull)
      .apiKeyRequired(apiKeyRequired.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
