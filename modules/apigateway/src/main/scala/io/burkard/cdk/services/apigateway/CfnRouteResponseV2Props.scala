package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRouteResponseV2Props {

  def apply(
    responseModels: Option[AnyRef] = None,
    routeId: Option[String] = None,
    routeResponseKey: Option[String] = None,
    responseParameters: Option[AnyRef] = None,
    apiId: Option[String] = None,
    modelSelectionExpression: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnRouteResponseV2Props =
    (new software.amazon.awscdk.services.apigateway.CfnRouteResponseV2Props.Builder)
      .responseModels(responseModels.orNull)
      .routeId(routeId.orNull)
      .routeResponseKey(routeResponseKey.orNull)
      .responseParameters(responseParameters.orNull)
      .apiId(apiId.orNull)
      .modelSelectionExpression(modelSelectionExpression.orNull)
      .build()
}
