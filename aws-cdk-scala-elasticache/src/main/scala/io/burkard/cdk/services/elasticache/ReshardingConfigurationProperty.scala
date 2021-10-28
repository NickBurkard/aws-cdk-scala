package io.burkard.cdk.services.elasticache

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ReshardingConfigurationProperty {

  def apply(
    preferredAvailabilityZones: Option[List[String]] = None,
    nodeGroupId: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty =
    (new software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty.Builder)
      .preferredAvailabilityZones(preferredAvailabilityZones.map(_.asJava).orNull)
      .nodeGroupId(nodeGroupId.orNull)
      .build()
}
