package io.burkard.cdk.services.elasticsearch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ElasticsearchClusterConfigProperty {

  def apply(
    warmCount: Option[Number] = None,
    warmEnabled: Option[Boolean] = None,
    zoneAwarenessEnabled: Option[Boolean] = None,
    dedicatedMasterEnabled: Option[Boolean] = None,
    instanceType: Option[String] = None,
    dedicatedMasterType: Option[String] = None,
    instanceCount: Option[Number] = None,
    zoneAwarenessConfig: Option[software.amazon.awscdk.services.elasticsearch.CfnDomain.ZoneAwarenessConfigProperty] = None,
    coldStorageOptions: Option[software.amazon.awscdk.services.elasticsearch.CfnDomain.ColdStorageOptionsProperty] = None,
    warmType: Option[String] = None,
    dedicatedMasterCount: Option[Number] = None
  ): software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty =
    (new software.amazon.awscdk.services.elasticsearch.CfnDomain.ElasticsearchClusterConfigProperty.Builder)
      .warmCount(warmCount.orNull)
      .warmEnabled(warmEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .zoneAwarenessEnabled(zoneAwarenessEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dedicatedMasterEnabled(dedicatedMasterEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceType(instanceType.orNull)
      .dedicatedMasterType(dedicatedMasterType.orNull)
      .instanceCount(instanceCount.orNull)
      .zoneAwarenessConfig(zoneAwarenessConfig.orNull)
      .coldStorageOptions(coldStorageOptions.orNull)
      .warmType(warmType.orNull)
      .dedicatedMasterCount(dedicatedMasterCount.orNull)
      .build()
}
