package io.burkard.cdk.services.elasticache

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnReplicationGroupProps {

  def apply(
    replicationGroupDescription: String,
    authToken: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    numNodeGroups: Option[Number] = None,
    snapshotWindow: Option[String] = None,
    automaticFailoverEnabled: Option[Boolean] = None,
    numCacheClusters: Option[Number] = None,
    notificationTopicArn: Option[String] = None,
    nodeGroupConfiguration: Option[List[_]] = None,
    port: Option[Number] = None,
    snapshotRetentionLimit: Option[Number] = None,
    replicationGroupId: Option[String] = None,
    logDeliveryConfigurations: Option[List[_]] = None,
    cacheSecurityGroupNames: Option[List[String]] = None,
    replicasPerNodeGroup: Option[Number] = None,
    engineVersion: Option[String] = None,
    snapshotArns: Option[List[String]] = None,
    transitEncryptionEnabled: Option[Boolean] = None,
    cacheParameterGroupName: Option[String] = None,
    atRestEncryptionEnabled: Option[Boolean] = None,
    primaryClusterId: Option[String] = None,
    cacheSubnetGroupName: Option[String] = None,
    userGroupIds: Option[List[String]] = None,
    preferredCacheClusterAZs: Option[List[String]] = None,
    securityGroupIds: Option[List[String]] = None,
    preferredMaintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None,
    snapshottingClusterId: Option[String] = None,
    globalReplicationGroupId: Option[String] = None,
    snapshotName: Option[String] = None,
    kmsKeyId: Option[String] = None,
    cacheNodeType: Option[String] = None,
    multiAzEnabled: Option[Boolean] = None,
    engine: Option[String] = None
  ): software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps =
    (new software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder)
      .replicationGroupDescription(replicationGroupDescription)
      .authToken(authToken.orNull)
      .tags(tags.map(_.asJava).orNull)
      .numNodeGroups(numNodeGroups.orNull)
      .snapshotWindow(snapshotWindow.orNull)
      .automaticFailoverEnabled(automaticFailoverEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .numCacheClusters(numCacheClusters.orNull)
      .notificationTopicArn(notificationTopicArn.orNull)
      .nodeGroupConfiguration(nodeGroupConfiguration.map(_.asJava).orNull)
      .port(port.orNull)
      .snapshotRetentionLimit(snapshotRetentionLimit.orNull)
      .replicationGroupId(replicationGroupId.orNull)
      .logDeliveryConfigurations(logDeliveryConfigurations.map(_.asJava).orNull)
      .cacheSecurityGroupNames(cacheSecurityGroupNames.map(_.asJava).orNull)
      .replicasPerNodeGroup(replicasPerNodeGroup.orNull)
      .engineVersion(engineVersion.orNull)
      .snapshotArns(snapshotArns.map(_.asJava).orNull)
      .transitEncryptionEnabled(transitEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cacheParameterGroupName(cacheParameterGroupName.orNull)
      .atRestEncryptionEnabled(atRestEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .primaryClusterId(primaryClusterId.orNull)
      .cacheSubnetGroupName(cacheSubnetGroupName.orNull)
      .userGroupIds(userGroupIds.map(_.asJava).orNull)
      .preferredCacheClusterAZs(preferredCacheClusterAZs.map(_.asJava).orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .snapshottingClusterId(snapshottingClusterId.orNull)
      .globalReplicationGroupId(globalReplicationGroupId.orNull)
      .snapshotName(snapshotName.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .cacheNodeType(cacheNodeType.orNull)
      .multiAzEnabled(multiAzEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .engine(engine.orNull)
      .build()
}
