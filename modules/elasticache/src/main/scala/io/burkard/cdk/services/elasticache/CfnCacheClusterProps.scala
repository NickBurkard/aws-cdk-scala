package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCacheClusterProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    notificationTopicArn: Option[String] = None,
    preferredAvailabilityZones: Option[List[String]] = None,
    snapshotRetentionLimit: Option[Number] = None,
    logDeliveryConfigurations: Option[List[_]] = None,
    snapshotName: Option[String] = None,
    cacheSecurityGroupNames: Option[List[String]] = None,
    cacheNodeType: Option[String] = None,
    engineVersion: Option[String] = None,
    engine: Option[String] = None,
    snapshotArns: Option[List[String]] = None,
    cacheParameterGroupName: Option[String] = None,
    vpcSecurityGroupIds: Option[List[String]] = None,
    cacheSubnetGroupName: Option[String] = None,
    azMode: Option[String] = None,
    snapshotWindow: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None,
    port: Option[Number] = None,
    numCacheNodes: Option[Number] = None,
    preferredAvailabilityZone: Option[String] = None,
    clusterName: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnCacheClusterProps =
    (new software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .notificationTopicArn(notificationTopicArn.orNull)
      .preferredAvailabilityZones(preferredAvailabilityZones.map(_.asJava).orNull)
      .snapshotRetentionLimit(snapshotRetentionLimit.orNull)
      .logDeliveryConfigurations(logDeliveryConfigurations.map(_.asJava).orNull)
      .snapshotName(snapshotName.orNull)
      .cacheSecurityGroupNames(cacheSecurityGroupNames.map(_.asJava).orNull)
      .cacheNodeType(cacheNodeType.orNull)
      .engineVersion(engineVersion.orNull)
      .engine(engine.orNull)
      .snapshotArns(snapshotArns.map(_.asJava).orNull)
      .cacheParameterGroupName(cacheParameterGroupName.orNull)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .cacheSubnetGroupName(cacheSubnetGroupName.orNull)
      .azMode(azMode.orNull)
      .snapshotWindow(snapshotWindow.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .port(port.orNull)
      .numCacheNodes(numCacheNodes.orNull)
      .preferredAvailabilityZone(preferredAvailabilityZone.orNull)
      .clusterName(clusterName.orNull)
      .build()
}
