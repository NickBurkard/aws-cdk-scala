package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object NodeGroupConfigurationProperty {

  def apply(
    replicaAvailabilityZones: Option[List[String]] = None,
    nodeGroupId: Option[String] = None,
    primaryAvailabilityZone: Option[String] = None,
    slots: Option[String] = None,
    replicaCount: Option[Number] = None
  ): software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty =
    (new software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder)
      .replicaAvailabilityZones(replicaAvailabilityZones.map(_.asJava).orNull)
      .nodeGroupId(nodeGroupId.orNull)
      .primaryAvailabilityZone(primaryAvailabilityZone.orNull)
      .slots(slots.orNull)
      .replicaCount(replicaCount.orNull)
      .build()
}
