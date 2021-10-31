package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object StageDescriptionProperty {

  def apply(
    cacheTtlInSeconds: Option[Number] = None,
    throttlingBurstLimit: Option[Number] = None,
    clientCertificateId: Option[String] = None,
    tracingEnabled: Option[Boolean] = None,
    dataTraceEnabled: Option[Boolean] = None,
    cacheClusterEnabled: Option[Boolean] = None,
    loggingLevel: Option[String] = None,
    throttlingRateLimit: Option[Number] = None,
    metricsEnabled: Option[Boolean] = None,
    description: Option[String] = None,
    canarySetting: Option[software.amazon.awscdk.services.apigateway.CfnDeployment.CanarySettingProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    documentationVersion: Option[String] = None,
    variables: Option[Map[String, String]] = None,
    accessLogSetting: Option[software.amazon.awscdk.services.apigateway.CfnDeployment.AccessLogSettingProperty] = None,
    cacheDataEncrypted: Option[Boolean] = None,
    cachingEnabled: Option[Boolean] = None,
    methodSettings: Option[List[_]] = None,
    cacheClusterSize: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty =
    (new software.amazon.awscdk.services.apigateway.CfnDeployment.StageDescriptionProperty.Builder)
      .cacheTtlInSeconds(cacheTtlInSeconds.orNull)
      .throttlingBurstLimit(throttlingBurstLimit.orNull)
      .clientCertificateId(clientCertificateId.orNull)
      .tracingEnabled(tracingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dataTraceEnabled(dataTraceEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cacheClusterEnabled(cacheClusterEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .loggingLevel(loggingLevel.orNull)
      .throttlingRateLimit(throttlingRateLimit.orNull)
      .metricsEnabled(metricsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .description(description.orNull)
      .canarySetting(canarySetting.orNull)
      .tags(tags.map(_.asJava).orNull)
      .documentationVersion(documentationVersion.orNull)
      .variables(variables.map(_.asJava).orNull)
      .accessLogSetting(accessLogSetting.orNull)
      .cacheDataEncrypted(cacheDataEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cachingEnabled(cachingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .methodSettings(methodSettings.map(_.asJava).orNull)
      .cacheClusterSize(cacheClusterSize.orNull)
      .build()
}
