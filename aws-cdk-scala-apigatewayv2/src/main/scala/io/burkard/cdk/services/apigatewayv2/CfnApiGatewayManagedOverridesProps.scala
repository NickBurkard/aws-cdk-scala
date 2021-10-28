package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApiGatewayManagedOverridesProps {

  def apply(
    stage: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty] = None,
    integration: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty] = None,
    apiId: Option[String] = None,
    route: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps.Builder)
      .stage(stage.orNull)
      .integration(integration.orNull)
      .apiId(apiId.orNull)
      .route(route.orNull)
      .build()
}
