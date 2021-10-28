package io.burkard.cdk.services.memorydb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnCluster {

  def apply(
    internalResourceId: String,
    snapshotArns: Option[List[String]] = None,
    subnetGroupName: Option[String] = None,
    snapshotWindow: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    maintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None,
    tlsEnabled: Option[Boolean] = None,
    parameterGroupName: Option[String] = None,
    aclName: Option[String] = None,
    port: Option[Number] = None,
    nodeType: Option[String] = None,
    snapshotName: Option[String] = None,
    kmsKeyId: Option[String] = None,
    clusterName: Option[String] = None,
    snsTopicArn: Option[String] = None,
    finalSnapshotName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    snapshotRetentionLimit: Option[Number] = None,
    clusterEndpoint: Option[software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty] = None,
    engineVersion: Option[String] = None,
    numReplicasPerShard: Option[Number] = None,
    numShards: Option[Number] = None,
    snsTopicStatus: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.memorydb.CfnCluster =
    software.amazon.awscdk.services.memorydb.CfnCluster.Builder
      .create(stackCtx, internalResourceId)
      .snapshotArns(snapshotArns.map(_.asJava).orNull)
      .subnetGroupName(subnetGroupName.orNull)
      .snapshotWindow(snapshotWindow.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .maintenanceWindow(maintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tlsEnabled(tlsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .parameterGroupName(parameterGroupName.orNull)
      .aclName(aclName.orNull)
      .port(port.orNull)
      .nodeType(nodeType.orNull)
      .snapshotName(snapshotName.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .clusterName(clusterName.orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .finalSnapshotName(finalSnapshotName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .snapshotRetentionLimit(snapshotRetentionLimit.orNull)
      .clusterEndpoint(clusterEndpoint.orNull)
      .engineVersion(engineVersion.orNull)
      .numReplicasPerShard(numReplicasPerShard.orNull)
      .numShards(numShards.orNull)
      .snsTopicStatus(snsTopicStatus.orNull)
      .build()
}
