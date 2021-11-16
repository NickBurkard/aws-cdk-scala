package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiGatewayManagedOverridesProps {

  def apply(
    apiId: String,
    stage: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty] = None,
    integration: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty] = None,
    route: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps.Builder)
      .apiId(apiId)
      .stage(stage.orNull)
      .integration(integration.orNull)
      .route(route.orNull)
      .build()
}
