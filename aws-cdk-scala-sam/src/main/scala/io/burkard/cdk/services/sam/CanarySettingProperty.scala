package io.burkard.cdk.services.sam

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CanarySettingProperty {

  def apply(
    percentTraffic: Option[Number] = None,
    deploymentId: Option[String] = None,
    stageVariableOverrides: Option[Map[String, String]] = None,
    useStageCache: Option[Boolean] = None
  ): software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty =
    (new software.amazon.awscdk.services.sam.CfnApi.CanarySettingProperty.Builder)
      .percentTraffic(percentTraffic.orNull)
      .deploymentId(deploymentId.orNull)
      .stageVariableOverrides(stageVariableOverrides.map(_.asJava).orNull)
      .useStageCache(useStageCache.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
