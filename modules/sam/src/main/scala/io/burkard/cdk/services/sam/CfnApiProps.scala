package io.burkard.cdk.services.sam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApiProps {

  def apply(
    openApiVersion: Option[String] = None,
    name: Option[String] = None,
    auth: Option[software.amazon.awscdk.services.sam.CfnApi.AuthProperty] = None,
    tracingEnabled: Option[Boolean] = None,
    binaryMediaTypes: Option[List[String]] = None,
    definitionBody: Option[AnyRef] = None,
    cacheClusterEnabled: Option[Boolean] = None,
    cors0: Option[String] = None,
    cors1: Option[software.amazon.awscdk.services.sam.CfnApi.CorsConfigurationProperty] = None,
    stageName: Option[String] = None,
    accessLogSetting: Option[software.amazon.awscdk.services.sam.CfnApi.AccessLogSettingProperty] = None,
    endpointConfiguration0: Option[String] = None,
    endpointConfiguration1: Option[software.amazon.awscdk.services.sam.CfnApi.EndpointConfigurationProperty] = None,
    models: Option[Map[String, String]] = None,
    minimumCompressionSize: Option[Number] = None,
    description: Option[String] = None,
    canarySetting: Option[software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty] = None,
    tags: Option[Map[String, String]] = None,
    variables: Option[Map[String, String]] = None,
    gatewayResponses: Option[Map[String, String]] = None,
    methodSettings: Option[List[_]] = None,
    definitionUri0: Option[software.amazon.awscdk.services.sam.CfnApi.S3LocationProperty] = None,
    definitionUri1: Option[String] = None,
    cacheClusterSize: Option[String] = None
  ): software.amazon.awscdk.services.sam.CfnApiProps =
    (new software.amazon.awscdk.services.sam.CfnApiProps.Builder)
      .openApiVersion(openApiVersion.orNull)
      .name(name.orNull)
      .auth(auth.orNull)
      .tracingEnabled(tracingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .binaryMediaTypes(binaryMediaTypes.map(_.asJava).orNull)
      .definitionBody(definitionBody.orNull)
      .cacheClusterEnabled(cacheClusterEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cors(cors0.orNull)
      .cors(cors1.orNull)
      .stageName(stageName.orNull)
      .accessLogSetting(accessLogSetting.orNull)
      .endpointConfiguration(endpointConfiguration0.orNull)
      .endpointConfiguration(endpointConfiguration1.orNull)
      .models(models.map(_.asJava).orNull)
      .minimumCompressionSize(minimumCompressionSize.orNull)
      .description(description.orNull)
      .canarySetting(canarySetting.orNull)
      .tags(tags.map(_.asJava).orNull)
      .variables(variables.map(_.asJava).orNull)
      .gatewayResponses(gatewayResponses.map(_.asJava).orNull)
      .methodSettings(methodSettings.map(_.asJava).orNull)
      .definitionUri(definitionUri0.orNull)
      .definitionUri(definitionUri1.orNull)
      .cacheClusterSize(cacheClusterSize.orNull)
      .build()
}
