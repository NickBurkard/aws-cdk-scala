package io.burkard.cdk.services.apigatewayv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnStage {

  def apply(
    internalResourceId: String,
    routeSettings: Option[AnyRef] = None,
    deploymentId: Option[String] = None,
    accessPolicyId: Option[String] = None,
    stageName: Option[String] = None,
    accessLogSettings: Option[software.amazon.awscdk.services.apigatewayv2.CfnStage.AccessLogSettingsProperty] = None,
    apiId: Option[String] = None,
    stageVariables: Option[AnyRef] = None,
    defaultRouteSettings: Option[software.amazon.awscdk.services.apigatewayv2.CfnStage.RouteSettingsProperty] = None,
    clientCertificateId: Option[String] = None,
    description: Option[String] = None,
    autoDeploy: Option[Boolean] = None,
    tags: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigatewayv2.CfnStage =
    software.amazon.awscdk.services.apigatewayv2.CfnStage.Builder
      .create(stackCtx, internalResourceId)
      .routeSettings(routeSettings.orNull)
      .deploymentId(deploymentId.orNull)
      .accessPolicyId(accessPolicyId.orNull)
      .stageName(stageName.orNull)
      .accessLogSettings(accessLogSettings.orNull)
      .apiId(apiId.orNull)
      .stageVariables(stageVariables.orNull)
      .defaultRouteSettings(defaultRouteSettings.orNull)
      .clientCertificateId(clientCertificateId.orNull)
      .description(description.orNull)
      .autoDeploy(autoDeploy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.orNull)
      .build()
}
