package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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
