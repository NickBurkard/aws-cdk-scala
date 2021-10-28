package io.burkard.cdk.services.neptune

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBCluster {

  def apply(
    internalResourceId: String,
    restoreType: Option[String] = None,
    snapshotIdentifier: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    preferredMaintenanceWindow: Option[String] = None,
    associatedRoles: Option[List[_]] = None,
    deletionProtection: Option[Boolean] = None,
    restoreToTime: Option[String] = None,
    kmsKeyId: Option[String] = None,
    enableCloudwatchLogsExports: Option[List[String]] = None,
    iamAuthEnabled: Option[Boolean] = None,
    sourceDbClusterIdentifier: Option[String] = None,
    storageEncrypted: Option[Boolean] = None,
    dbClusterIdentifier: Option[String] = None,
    vpcSecurityGroupIds: Option[List[String]] = None,
    port: Option[Number] = None,
    backupRetentionPeriod: Option[Number] = None,
    dbSubnetGroupName: Option[String] = None,
    dbClusterParameterGroupName: Option[String] = None,
    preferredBackupWindow: Option[String] = None,
    availabilityZones: Option[List[String]] = None,
    engineVersion: Option[String] = None,
    useLatestRestorableTime: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.neptune.CfnDBCluster =
    software.amazon.awscdk.services.neptune.CfnDBCluster.Builder
      .create(stackCtx, internalResourceId)
      .restoreType(restoreType.orNull)
      .snapshotIdentifier(snapshotIdentifier.orNull)
      .tags(tags.map(_.asJava).orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .associatedRoles(associatedRoles.map(_.asJava).orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .restoreToTime(restoreToTime.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .enableCloudwatchLogsExports(enableCloudwatchLogsExports.map(_.asJava).orNull)
      .iamAuthEnabled(iamAuthEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceDbClusterIdentifier(sourceDbClusterIdentifier.orNull)
      .storageEncrypted(storageEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dbClusterIdentifier(dbClusterIdentifier.orNull)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .port(port.orNull)
      .backupRetentionPeriod(backupRetentionPeriod.orNull)
      .dbSubnetGroupName(dbSubnetGroupName.orNull)
      .dbClusterParameterGroupName(dbClusterParameterGroupName.orNull)
      .preferredBackupWindow(preferredBackupWindow.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .engineVersion(engineVersion.orNull)
      .useLatestRestorableTime(useLatestRestorableTime.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
