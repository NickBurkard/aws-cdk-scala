package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteResponseV2 {

  def apply(
    internalResourceId: String,
    routeId: String,
    routeResponseKey: String,
    apiId: String,
    responseModels: Option[AnyRef] = None,
    responseParameters: Option[AnyRef] = None,
    modelSelectionExpression: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnRouteResponseV2 =
    software.amazon.awscdk.services.apigateway.CfnRouteResponseV2.Builder
      .create(stackCtx, internalResourceId)
      .routeId(routeId)
      .routeResponseKey(routeResponseKey)
      .apiId(apiId)
      .responseModels(responseModels.orNull)
      .responseParameters(responseParameters.orNull)
      .modelSelectionExpression(modelSelectionExpression.orNull)
      .build()
}
