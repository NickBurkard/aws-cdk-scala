package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnRouteResponse {

  def apply(
    internalResourceId: String,
    responseModels: Option[AnyRef] = None,
    routeId: Option[String] = None,
    routeResponseKey: Option[String] = None,
    responseParameters: Option[AnyRef] = None,
    apiId: Option[String] = None,
    modelSelectionExpression: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse =
    software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.Builder
      .create(stackCtx, internalResourceId)
      .responseModels(responseModels.orNull)
      .routeId(routeId.orNull)
      .routeResponseKey(routeResponseKey.orNull)
      .responseParameters(responseParameters.orNull)
      .apiId(apiId.orNull)
      .modelSelectionExpression(modelSelectionExpression.orNull)
      .build()
}
