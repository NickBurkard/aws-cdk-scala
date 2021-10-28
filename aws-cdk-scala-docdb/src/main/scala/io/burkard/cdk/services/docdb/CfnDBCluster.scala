package io.burkard.cdk.services.docdb

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBCluster {

  def apply(
    internalResourceId: String,
    snapshotIdentifier: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    deletionProtection: Option[Boolean] = None,
    kmsKeyId: Option[String] = None,
    enableCloudwatchLogsExports: Option[List[String]] = None,
    engineVersion: Option[String] = None,
    storageEncrypted: Option[Boolean] = None,
    dbClusterIdentifier: Option[String] = None,
    vpcSecurityGroupIds: Option[List[String]] = None,
    masterUserPassword: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    port: Option[Number] = None,
    backupRetentionPeriod: Option[Number] = None,
    dbSubnetGroupName: Option[String] = None,
    dbClusterParameterGroupName: Option[String] = None,
    masterUsername: Option[String] = None,
    preferredBackupWindow: Option[String] = None,
    availabilityZones: Option[List[String]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.docdb.CfnDBCluster =
    software.amazon.awscdk.services.docdb.CfnDBCluster.Builder
      .create(stackCtx, internalResourceId)
      .snapshotIdentifier(snapshotIdentifier.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .kmsKeyId(kmsKeyId.orNull)
      .enableCloudwatchLogsExports(enableCloudwatchLogsExports.map(_.asJava).orNull)
      .engineVersion(engineVersion.orNull)
      .storageEncrypted(storageEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dbClusterIdentifier(dbClusterIdentifier.orNull)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .masterUserPassword(masterUserPassword.orNull)
      .tags(tags.map(_.asJava).orNull)
      .port(port.orNull)
      .backupRetentionPeriod(backupRetentionPeriod.orNull)
      .dbSubnetGroupName(dbSubnetGroupName.orNull)
      .dbClusterParameterGroupName(dbClusterParameterGroupName.orNull)
      .masterUsername(masterUsername.orNull)
      .preferredBackupWindow(preferredBackupWindow.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .build()
}
