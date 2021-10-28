package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object StageOverridesProperty {

  def apply(
    routeSettings: Option[AnyRef] = None,
    defaultRouteSettings: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty] = None,
    accessLogSettings: Option[software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty] = None,
    stageVariables: Option[AnyRef] = None,
    description: Option[String] = None,
    autoDeploy: Option[Boolean] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty =
    (new software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty.Builder)
      .routeSettings(routeSettings.orNull)
      .defaultRouteSettings(defaultRouteSettings.orNull)
      .accessLogSettings(accessLogSettings.orNull)
      .stageVariables(stageVariables.orNull)
      .description(description.orNull)
      .autoDeploy(autoDeploy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
