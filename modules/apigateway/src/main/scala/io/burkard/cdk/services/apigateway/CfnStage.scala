package io.burkard.cdk.services.apigateway

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStage {

  def apply(
    internalResourceId: String,
    restApiId: String,
    clientCertificateId: Option[String] = None,
    tracingEnabled: Option[Boolean] = None,
    deploymentId: Option[String] = None,
    cacheClusterEnabled: Option[Boolean] = None,
    stageName: Option[String] = None,
    accessLogSetting: Option[software.amazon.awscdk.services.apigateway.CfnStage.AccessLogSettingProperty] = None,
    description: Option[String] = None,
    canarySetting: Option[software.amazon.awscdk.services.apigateway.CfnStage.CanarySettingProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    documentationVersion: Option[String] = None,
    variables: Option[Map[String, String]] = None,
    methodSettings: Option[List[_]] = None,
    cacheClusterSize: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.apigateway.CfnStage =
    software.amazon.awscdk.services.apigateway.CfnStage.Builder
      .create(stackCtx, internalResourceId)
      .restApiId(restApiId)
      .clientCertificateId(clientCertificateId.orNull)
      .tracingEnabled(tracingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deploymentId(deploymentId.orNull)
      .cacheClusterEnabled(cacheClusterEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stageName(stageName.orNull)
      .accessLogSetting(accessLogSetting.orNull)
      .description(description.orNull)
      .canarySetting(canarySetting.orNull)
      .tags(tags.map(_.asJava).orNull)
      .documentationVersion(documentationVersion.orNull)
      .variables(variables.map(_.asJava).orNull)
      .methodSettings(methodSettings.map(_.asJava).orNull)
      .cacheClusterSize(cacheClusterSize.orNull)
      .build()
}
