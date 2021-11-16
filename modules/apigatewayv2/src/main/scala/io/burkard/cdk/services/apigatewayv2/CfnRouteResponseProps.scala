package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteResponseProps {

  def apply(
    routeId: String,
    routeResponseKey: String,
    apiId: String,
    responseModels: Option[AnyRef] = None,
    responseParameters: Option[AnyRef] = None,
    modelSelectionExpression: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps.Builder)
      .routeId(routeId)
      .routeResponseKey(routeResponseKey)
      .apiId(apiId)
      .responseModels(responseModels.orNull)
      .responseParameters(responseParameters.orNull)
      .modelSelectionExpression(modelSelectionExpression.orNull)
      .build()
}
