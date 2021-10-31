package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RegionalConfigurationProperty {

  def apply(
    replicationGroupRegion: Option[String] = None,
    reshardingConfigurations: Option[List[_]] = None,
    replicationGroupId: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty =
    (new software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty.Builder)
      .replicationGroupRegion(replicationGroupRegion.orNull)
      .reshardingConfigurations(reshardingConfigurations.map(_.asJava).orNull)
      .replicationGroupId(replicationGroupId.orNull)
      .build()
}
