package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiGatewayManagedOverrides {

  def apply(
    internalResourceId: String,
    stage: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty] = None,
    integration: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty] = None,
    apiId: Option[String] = None,
    route: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides =
    software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.Builder
      .create(stackCtx, internalResourceId)
      .stage(stage.orNull)
      .integration(integration.orNull)
      .apiId(apiId.orNull)
      .route(route.orNull)
      .build()
}
