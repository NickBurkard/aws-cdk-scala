package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteResponseProps {

  def apply(
    responseModels: Option[AnyRef] = None,
    routeId: Option[String] = None,
    routeResponseKey: Option[String] = None,
    responseParameters: Option[AnyRef] = None,
    apiId: Option[String] = None,
    modelSelectionExpression: Option[String] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps.Builder)
      .responseModels(responseModels.orNull)
      .routeId(routeId.orNull)
      .routeResponseKey(routeResponseKey.orNull)
      .responseParameters(responseParameters.orNull)
      .apiId(apiId.orNull)
      .modelSelectionExpression(modelSelectionExpression.orNull)
      .build()
}
