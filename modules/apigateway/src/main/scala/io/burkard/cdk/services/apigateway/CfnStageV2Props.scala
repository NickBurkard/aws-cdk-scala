package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStageV2Props {

  def apply(
    stageName: String,
    apiId: String,
    routeSettings: Option[AnyRef] = None,
    deploymentId: Option[String] = None,
    accessLogSettings: Option[software.amazon.awscdk.services.apigateway.CfnStageV2.AccessLogSettingsProperty] = None,
    stageVariables: Option[AnyRef] = None,
    defaultRouteSettings: Option[software.amazon.awscdk.services.apigateway.CfnStageV2.RouteSettingsProperty] = None,
    clientCertificateId: Option[String] = None,
    description: Option[String] = None,
    autoDeploy: Option[Boolean] = None,
    tags: Option[AnyRef] = None
  ): software.amazon.awscdk.services.apigateway.CfnStageV2Props =
    (new software.amazon.awscdk.services.apigateway.CfnStageV2Props.Builder)
      .stageName(stageName)
      .apiId(apiId)
      .routeSettings(routeSettings.orNull)
      .deploymentId(deploymentId.orNull)
      .accessLogSettings(accessLogSettings.orNull)
      .stageVariables(stageVariables.orNull)
      .defaultRouteSettings(defaultRouteSettings.orNull)
      .clientCertificateId(clientCertificateId.orNull)
      .description(description.orNull)
      .autoDeploy(autoDeploy.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.orNull)
      .build()
}
