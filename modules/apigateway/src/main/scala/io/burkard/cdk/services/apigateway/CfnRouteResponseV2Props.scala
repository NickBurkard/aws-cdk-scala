package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteResponseV2Props {

  def apply(
    routeId: String,
    routeResponseKey: String,
    apiId: String,
    responseModels: Option[AnyRef] = None,
    responseParameters: Option[AnyRef] = None,
    modelSelectionExpression: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnRouteResponseV2Props =
    (new software.amazon.awscdk.services.apigateway.CfnRouteResponseV2Props.Builder)
      .routeId(routeId)
      .routeResponseKey(routeResponseKey)
      .apiId(apiId)
      .responseModels(responseModels.orNull)
      .responseParameters(responseParameters.orNull)
      .modelSelectionExpression(modelSelectionExpression.orNull)
      .build()
}
