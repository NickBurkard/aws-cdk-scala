package io.burkard.cdk.services.memorydb

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterProps {

  def apply(
    aclName: String,
    nodeType: String,
    clusterName: String,
    snapshotArns: Option[List[String]] = None,
    subnetGroupName: Option[String] = None,
    snapshotWindow: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    maintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None,
    tlsEnabled: Option[Boolean] = None,
    parameterGroupName: Option[String] = None,
    port: Option[Number] = None,
    snapshotRetentionLimit: Option[Number] = None,
    snapshotName: Option[String] = None,
    kmsKeyId: Option[String] = None,
    snsTopicArn: Option[String] = None,
    finalSnapshotName: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    engineVersion: Option[String] = None,
    numReplicasPerShard: Option[Number] = None,
    numShards: Option[Number] = None,
    snsTopicStatus: Option[String] = None
  ): software.amazon.awscdk.services.memorydb.CfnClusterProps =
    (new software.amazon.awscdk.services.memorydb.CfnClusterProps.Builder)
      .aclName(aclName)
      .nodeType(nodeType)
      .clusterName(clusterName)
      .snapshotArns(snapshotArns.map(_.asJava).orNull)
      .subnetGroupName(subnetGroupName.orNull)
      .snapshotWindow(snapshotWindow.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .maintenanceWindow(maintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tlsEnabled(tlsEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .parameterGroupName(parameterGroupName.orNull)
      .port(port.orNull)
      .snapshotRetentionLimit(snapshotRetentionLimit.orNull)
      .snapshotName(snapshotName.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .finalSnapshotName(finalSnapshotName.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .engineVersion(engineVersion.orNull)
      .numReplicasPerShard(numReplicasPerShard.orNull)
      .numShards(numShards.orNull)
      .snsTopicStatus(snsTopicStatus.orNull)
      .build()
}
