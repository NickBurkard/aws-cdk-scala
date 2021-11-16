package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDBInstanceProps {

  def apply(
    dbInstanceClass: String,
    dbParameterGroupName: Option[String] = None,
    monitoringRoleArn: Option[String] = None,
    storageType: Option[String] = None,
    processorFeatures: Option[List[_]] = None,
    domainIamRoleName: Option[String] = None,
    iops: Option[Number] = None,
    deleteAutomatedBackups: Option[Boolean] = None,
    dbInstanceIdentifier: Option[String] = None,
    kmsKeyId: Option[String] = None,
    engineVersion: Option[String] = None,
    vpcSecurityGroups: Option[List[String]] = None,
    storageEncrypted: Option[Boolean] = None,
    dbClusterIdentifier: Option[String] = None,
    multiAz: Option[Boolean] = None,
    performanceInsightsRetentionPeriod: Option[Number] = None,
    dbName: Option[String] = None,
    masterUserPassword: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    domain: Option[String] = None,
    timezone: Option[String] = None,
    optionGroupName: Option[String] = None,
    availabilityZone: Option[String] = None,
    dbSnapshotIdentifier: Option[String] = None,
    caCertificateIdentifier: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None,
    characterSetName: Option[String] = None,
    maxAllocatedStorage: Option[Number] = None,
    performanceInsightsKmsKeyId: Option[String] = None,
    associatedRoles: Option[List[_]] = None,
    deletionProtection: Option[Boolean] = None,
    copyTagsToSnapshot: Option[Boolean] = None,
    allocatedStorage: Option[String] = None,
    sourceRegion: Option[String] = None,
    backupRetentionPeriod: Option[Number] = None,
    allowMajorVersionUpgrade: Option[Boolean] = None,
    port: Option[String] = None,
    dbSubnetGroupName: Option[String] = None,
    licenseModel: Option[String] = None,
    enableCloudwatchLogsExports: Option[List[String]] = None,
    publiclyAccessible: Option[Boolean] = None,
    useDefaultProcessorFeatures: Option[Boolean] = None,
    masterUsername: Option[String] = None,
    preferredBackupWindow: Option[String] = None,
    promotionTier: Option[Number] = None,
    enableIamDatabaseAuthentication: Option[Boolean] = None,
    sourceDbInstanceIdentifier: Option[String] = None,
    engine: Option[String] = None,
    dbSecurityGroups: Option[List[String]] = None,
    monitoringInterval: Option[Number] = None,
    enablePerformanceInsights: Option[Boolean] = None
  ): software.amazon.awscdk.services.rds.CfnDBInstanceProps =
    (new software.amazon.awscdk.services.rds.CfnDBInstanceProps.Builder)
      .dbInstanceClass(dbInstanceClass)
      .dbParameterGroupName(dbParameterGroupName.orNull)
      .monitoringRoleArn(monitoringRoleArn.orNull)
      .storageType(storageType.orNull)
      .processorFeatures(processorFeatures.map(_.asJava).orNull)
      .domainIamRoleName(domainIamRoleName.orNull)
      .iops(iops.orNull)
      .deleteAutomatedBackups(deleteAutomatedBackups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dbInstanceIdentifier(dbInstanceIdentifier.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .engineVersion(engineVersion.orNull)
      .vpcSecurityGroups(vpcSecurityGroups.map(_.asJava).orNull)
      .storageEncrypted(storageEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dbClusterIdentifier(dbClusterIdentifier.orNull)
      .multiAz(multiAz.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .performanceInsightsRetentionPeriod(performanceInsightsRetentionPeriod.orNull)
      .dbName(dbName.orNull)
      .masterUserPassword(masterUserPassword.orNull)
      .tags(tags.map(_.asJava).orNull)
      .domain(domain.orNull)
      .timezone(timezone.orNull)
      .optionGroupName(optionGroupName.orNull)
      .availabilityZone(availabilityZone.orNull)
      .dbSnapshotIdentifier(dbSnapshotIdentifier.orNull)
      .caCertificateIdentifier(caCertificateIdentifier.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .characterSetName(characterSetName.orNull)
      .maxAllocatedStorage(maxAllocatedStorage.orNull)
      .performanceInsightsKmsKeyId(performanceInsightsKmsKeyId.orNull)
      .associatedRoles(associatedRoles.map(_.asJava).orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .copyTagsToSnapshot(copyTagsToSnapshot.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allocatedStorage(allocatedStorage.orNull)
      .sourceRegion(sourceRegion.orNull)
      .backupRetentionPeriod(backupRetentionPeriod.orNull)
      .allowMajorVersionUpgrade(allowMajorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .port(port.orNull)
      .dbSubnetGroupName(dbSubnetGroupName.orNull)
      .licenseModel(licenseModel.orNull)
      .enableCloudwatchLogsExports(enableCloudwatchLogsExports.map(_.asJava).orNull)
      .publiclyAccessible(publiclyAccessible.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .useDefaultProcessorFeatures(useDefaultProcessorFeatures.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .masterUsername(masterUsername.orNull)
      .preferredBackupWindow(preferredBackupWindow.orNull)
      .promotionTier(promotionTier.orNull)
      .enableIamDatabaseAuthentication(enableIamDatabaseAuthentication.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .sourceDbInstanceIdentifier(sourceDbInstanceIdentifier.orNull)
      .engine(engine.orNull)
      .dbSecurityGroups(dbSecurityGroups.map(_.asJava).orNull)
      .monitoringInterval(monitoringInterval.orNull)
      .enablePerformanceInsights(enablePerformanceInsights.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
