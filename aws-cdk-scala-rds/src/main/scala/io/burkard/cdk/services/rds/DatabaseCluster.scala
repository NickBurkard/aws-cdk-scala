package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseCluster {

  def apply(
    internalResourceId: String,
    s3ExportRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    subnetGroup: Option[software.amazon.awscdk.services.rds.ISubnetGroup] = None,
    backup: Option[software.amazon.awscdk.services.rds.BackupProps] = None,
    storageEncrypted: Option[Boolean] = None,
    instances: Option[Number] = None,
    preferredMaintenanceWindow: Option[String] = None,
    s3ImportRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    monitoringRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    parameterGroup: Option[software.amazon.awscdk.services.rds.IParameterGroup] = None,
    cloudwatchLogsExports: Option[List[String]] = None,
    port: Option[Number] = None,
    instanceProps: Option[software.amazon.awscdk.services.rds.InstanceProps] = None,
    s3ExportBuckets: Option[List[_ <: software.amazon.awscdk.services.s3.IBucket]] = None,
    monitoringInterval: Option[software.amazon.awscdk.Duration] = None,
    iamAuthentication: Option[Boolean] = None,
    s3ImportBuckets: Option[List[_ <: software.amazon.awscdk.services.s3.IBucket]] = None,
    defaultDatabaseName: Option[String] = None,
    clusterIdentifier: Option[String] = None,
    deletionProtection: Option[Boolean] = None,
    copyTagsToSnapshot: Option[Boolean] = None,
    storageEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    cloudwatchLogsRetentionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    instanceIdentifierBase: Option[String] = None,
    cloudwatchLogsRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    credentials: Option[software.amazon.awscdk.services.rds.Credentials] = None,
    engine: Option[software.amazon.awscdk.services.rds.IClusterEngine] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.DatabaseCluster =
    software.amazon.awscdk.services.rds.DatabaseCluster.Builder
      .create(stackCtx, internalResourceId)
      .s3ExportRole(s3ExportRole.orNull)
      .subnetGroup(subnetGroup.orNull)
      .backup(backup.orNull)
      .storageEncrypted(storageEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instances(instances.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .s3ImportRole(s3ImportRole.orNull)
      .monitoringRole(monitoringRole.orNull)
      .parameterGroup(parameterGroup.orNull)
      .cloudwatchLogsExports(cloudwatchLogsExports.map(_.asJava).orNull)
      .port(port.orNull)
      .instanceProps(instanceProps.orNull)
      .s3ExportBuckets(s3ExportBuckets.map(_.asJava).orNull)
      .monitoringInterval(monitoringInterval.orNull)
      .iamAuthentication(iamAuthentication.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3ImportBuckets(s3ImportBuckets.map(_.asJava).orNull)
      .defaultDatabaseName(defaultDatabaseName.orNull)
      .clusterIdentifier(clusterIdentifier.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .copyTagsToSnapshot(copyTagsToSnapshot.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .storageEncryptionKey(storageEncryptionKey.orNull)
      .cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole.orNull)
      .instanceIdentifierBase(instanceIdentifierBase.orNull)
      .cloudwatchLogsRetention(cloudwatchLogsRetention.orNull)
      .removalPolicy(removalPolicy.orNull)
      .credentials(credentials.orNull)
      .engine(engine.orNull)
      .build()
}
