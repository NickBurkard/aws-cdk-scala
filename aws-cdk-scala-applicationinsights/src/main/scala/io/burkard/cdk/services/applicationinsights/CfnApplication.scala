package io.burkard.cdk.services.applicationinsights

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApplication {

  def apply(
    internalResourceId: String,
    cweMonitorEnabled: Option[Boolean] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    componentMonitoringSettings: Option[List[_]] = None,
    logPatternSets: Option[List[_]] = None,
    customComponents: Option[List[_]] = None,
    resourceGroupName: Option[String] = None,
    opsItemSnsTopicArn: Option[String] = None,
    autoConfigurationEnabled: Option[Boolean] = None,
    opsCenterEnabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.applicationinsights.CfnApplication =
    software.amazon.awscdk.services.applicationinsights.CfnApplication.Builder
      .create(stackCtx, internalResourceId)
      .cweMonitorEnabled(cweMonitorEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .componentMonitoringSettings(componentMonitoringSettings.map(_.asJava).orNull)
      .logPatternSets(logPatternSets.map(_.asJava).orNull)
      .customComponents(customComponents.map(_.asJava).orNull)
      .resourceGroupName(resourceGroupName.orNull)
      .opsItemSnsTopicArn(opsItemSnsTopicArn.orNull)
      .autoConfigurationEnabled(autoConfigurationEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .opsCenterEnabled(opsCenterEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
