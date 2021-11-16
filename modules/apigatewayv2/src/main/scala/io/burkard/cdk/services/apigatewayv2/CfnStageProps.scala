package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStageProps {

  def apply(
    stageName: String,
    apiId: String,
    routeSettings: Option[AnyRef] = None,
    deploymentId: Option[String] = None,
    accessPolicyId: Option[String] = None,
    accessLogSettings: Option[software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty] = None,
    stageVariables: Option[AnyRef] = None,
    defaultRouteSettings: Option[software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty] = None,
    clientCertificateId: Option[String] = None,
    description: Option[String] = None,
    autoDeploy: Option[Boolean] = None,
    tags: Option[AnyRef] = None
  ): software.amazon.awscdk.services.apigatewayv2.CfnStageProps =
    (new software.amazon.awscdk.services.apigatewayv2.CfnStageProps.Builder)
      .stageName(stageName)
      .apiId(apiId)
      .routeSettings(routeSettings.orNull)
      .deploymentId(deploymentId.orNull)
      .accessPolicyId(accessPolicyId.orNull)
      .accessLogSettings(accessLogSettings.orNull)
      .stageVariables(stageVariables.orNull)
      .defaultRouteSettings(defaultRouteSettings.orNull)
      .clientCertificateId(clientCertificateId.orNull)
      .description(description.orNull)
      .autoDeploy(autoDeploy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.orNull)
      .build()
}
