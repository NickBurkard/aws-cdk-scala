package io.burkard.cdk.services.opensearchservice

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClusterConfigProperty {

  def apply(
    warmCount: Option[Number] = None,
    warmEnabled: Option[Boolean] = None,
    zoneAwarenessEnabled: Option[Boolean] = None,
    dedicatedMasterEnabled: Option[Boolean] = None,
    instanceType: Option[String] = None,
    dedicatedMasterType: Option[String] = None,
    instanceCount: Option[Number] = None,
    zoneAwarenessConfig: Option[software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty] = None,
    warmType: Option[String] = None,
    dedicatedMasterCount: Option[Number] = None
  ): software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty =
    (new software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty.Builder)
      .warmCount(warmCount.orNull)
      .warmEnabled(warmEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .zoneAwarenessEnabled(zoneAwarenessEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dedicatedMasterEnabled(dedicatedMasterEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceType(instanceType.orNull)
      .dedicatedMasterType(dedicatedMasterType.orNull)
      .instanceCount(instanceCount.orNull)
      .zoneAwarenessConfig(zoneAwarenessConfig.orNull)
      .warmType(warmType.orNull)
      .dedicatedMasterCount(dedicatedMasterCount.orNull)
      .build()
}
