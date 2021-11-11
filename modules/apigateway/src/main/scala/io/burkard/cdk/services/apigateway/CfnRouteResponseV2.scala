package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteResponseV2 {

  def apply(
    internalResourceId: String,
    responseModels: Option[AnyRef] = None,
    routeId: Option[String] = None,
    routeResponseKey: Option[String] = None,
    responseParameters: Option[AnyRef] = None,
    apiId: Option[String] = None,
    modelSelectionExpression: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnRouteResponseV2 =
    software.amazon.awscdk.services.apigateway.CfnRouteResponseV2.Builder
      .create(stackCtx, internalResourceId)
      .responseModels(responseModels.orNull)
      .routeId(routeId.orNull)
      .routeResponseKey(routeResponseKey.orNull)
      .responseParameters(responseParameters.orNull)
      .apiId(apiId.orNull)
      .modelSelectionExpression(modelSelectionExpression.orNull)
      .build()
}
