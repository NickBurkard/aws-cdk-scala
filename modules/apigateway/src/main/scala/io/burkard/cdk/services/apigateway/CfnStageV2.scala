package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStageV2 {

  def apply(
    internalResourceId: String,
    routeSettings: Option[AnyRef] = None,
    deploymentId: Option[String] = None,
    stageName: Option[String] = None,
    accessLogSettings: Option[software.amazon.awscdk.services.apigateway.CfnStageV2.AccessLogSettingsProperty] = None,
    apiId: Option[String] = None,
    stageVariables: Option[AnyRef] = None,
    defaultRouteSettings: Option[software.amazon.awscdk.services.apigateway.CfnStageV2.RouteSettingsProperty] = None,
    clientCertificateId: Option[String] = None,
    description: Option[String] = None,
    autoDeploy: Option[Boolean] = None,
    tags: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnStageV2 =
    software.amazon.awscdk.services.apigateway.CfnStageV2.Builder
      .create(stackCtx, internalResourceId)
      .routeSettings(routeSettings.orNull)
      .deploymentId(deploymentId.orNull)
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