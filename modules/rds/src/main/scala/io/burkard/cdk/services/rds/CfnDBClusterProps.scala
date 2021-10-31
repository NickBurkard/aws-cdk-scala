package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnDBClusterProps {

  def apply(
    restoreType: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    associatedRoles: Option[List[_]] = None,
    scalingConfiguration: Option[software.amazon.awscdk.services.rds.CfnDBCluster.ScalingConfigurationProperty] = None,
    enableCloudwatchLogsExports: Option[List[String]] = None,
    enableHttpEndpoint: Option[Boolean] = None,
    snapshotIdentifier: Option[String] = None,
    engineMode: Option[String] = None,
    sourceDbClusterIdentifier: Option[String] = None,
    storageEncrypted: Option[Boolean] = None,
    dbClusterIdentifier: Option[String] = None,
    vpcSecurityGroupIds: Option[List[String]] = None,
    globalClusterIdentifier: Option[String] = None,
    masterUserPassword: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    deletionProtection: Option[Boolean] = None,
    copyTagsToSnapshot: Option[Boolean] = None,
    replicationSourceIdentifier: Option[String] = None,
    port: Option[Number] = None,
    sourceRegion: Option[String] = None,
    backupRetentionPeriod: Option[Number] = None,
    dbSubnetGroupName: Option[String] = None,
    dbClusterParameterGroupName: Option[String] = None,
    databaseName: Option[String] = None,
    kmsKeyId: Option[String] = None,
    masterUsername: Option[String] = None,
    preferredBackupWindow: Option[String] = None,
    availabilityZones: Option[List[String]] = None,
    backtrackWindow: Option[Number] = None,
    engineVersion: Option[String] = None,
    useLatestRestorableTime: Option[Boolean] = None,
    enableIamDatabaseAuthentication: Option[Boolean] = None,
    engine: Option[String] = None
  ): software.amazon.awscdk.services.rds.CfnDBClusterProps =
    (new software.amazon.awscdk.services.rds.CfnDBClusterProps.Builder)
      .restoreType(restoreType.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .associatedRoles(associatedRoles.map(_.asJava).orNull)
      .scalingConfiguration(scalingConfiguration.orNull)
      .enableCloudwatchLogsExports(enableCloudwatchLogsExports.map(_.asJava).orNull)
      .enableHttpEndpoint(enableHttpEndpoint.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .snapshotIdentifier(snapshotIdentifier.orNull)
      .engineMode(engineMode.orNull)
      .sourceDbClusterIdentifier(sourceDbClusterIdentifier.orNull)
      .storageEncrypted(storageEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dbClusterIdentifier(dbClusterIdentifier.orNull)
      .vpcSecurityGroupIds(vpcSecurityGroupIds.map(_.asJava).orNull)
      .globalClusterIdentifier(globalClusterIdentifier.orNull)
      .masterUserPassword(masterUserPassword.orNull)
      .tags(tags.map(_.asJava).orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .copyTagsToSnapshot(copyTagsToSnapshot.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .replicationSourceIdentifier(replicationSourceIdentifier.orNull)
      .port(port.orNull)
      .sourceRegion(sourceRegion.orNull)
      .backupRetentionPeriod(backupRetentionPeriod.orNull)
      .dbSubnetGroupName(dbSubnetGroupName.orNull)
      .dbClusterParameterGroupName(dbClusterParameterGroupName.orNull)
      .databaseName(databaseName.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .masterUsername(masterUsername.orNull)
      .preferredBackupWindow(preferredBackupWindow.orNull)
      .availabilityZones(availabilityZones.map(_.asJava).orNull)
      .backtrackWindow(backtrackWindow.orNull)
      .engineVersion(engineVersion.orNull)
      .useLatestRestorableTime(useLatestRestorableTime.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .enableIamDatabaseAuthentication(enableIamDatabaseAuthentication.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .engine(engine.orNull)
      .build()
}
