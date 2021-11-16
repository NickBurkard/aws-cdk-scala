package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiGatewayManagedOverrides {

  def apply(
    internalResourceId: String,
    apiId: String,
    stage: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty] = None,
    integration: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty] = None,
    route: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides =
    software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.Builder
      .create(stackCtx, internalResourceId)
      .apiId(apiId)
      .stage(stage.orNull)
      .integration(integration.orNull)
      .route(route.orNull)
      .build()
}
