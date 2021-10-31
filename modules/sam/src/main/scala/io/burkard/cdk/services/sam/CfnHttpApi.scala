package io.burkard.cdk.services.sam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnHttpApi {

  def apply(
    internalResourceId: String,
    corsConfiguration0: Option[software.amazon.awscdk.services.sam.CfnHttpApi.CorsConfigurationObjectProperty] = None,
    corsConfiguration1: Option[Boolean] = None,
    defaultRouteSettings: Option[software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty] = None,
    domain: Option[software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiDomainConfigurationProperty] = None,
    failOnWarnings: Option[Boolean] = None,
    definitionBody: Option[AnyRef] = None,
    stageName: Option[String] = None,
    disableExecuteApiEndpoint: Option[Boolean] = None,
    accessLogSetting: Option[software.amazon.awscdk.services.sam.CfnHttpApi.AccessLogSettingProperty] = None,
    definitionUri0: Option[software.amazon.awscdk.services.sam.CfnHttpApi.S3LocationProperty] = None,
    definitionUri1: Option[String] = None,
    stageVariables: Option[Map[String, String]] = None,
    auth: Option[software.amazon.awscdk.services.sam.CfnHttpApi.HttpApiAuthProperty] = None,
    routeSettings: Option[software.amazon.awscdk.services.sam.CfnHttpApi.RouteSettingsProperty] = None,
    description: Option[String] = None,
    tags: Option[Map[String, String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sam.CfnHttpApi =
    software.amazon.awscdk.services.sam.CfnHttpApi.Builder
      .create(stackCtx, internalResourceId)
      .corsConfiguration(corsConfiguration0.orNull)
      .corsConfiguration(corsConfiguration1.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .defaultRouteSettings(defaultRouteSettings.orNull)
      .domain(domain.orNull)
      .failOnWarnings(failOnWarnings.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .definitionBody(definitionBody.orNull)
      .stageName(stageName.orNull)
      .disableExecuteApiEndpoint(disableExecuteApiEndpoint.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .accessLogSetting(accessLogSetting.orNull)
      .definitionUri(definitionUri0.orNull)
      .definitionUri(definitionUri1.orNull)
      .stageVariables(stageVariables.map(_.asJava).orNull)
      .auth(auth.orNull)
      .routeSettings(routeSettings.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
