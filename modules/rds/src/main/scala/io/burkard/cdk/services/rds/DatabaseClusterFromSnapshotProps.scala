package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseClusterFromSnapshotProps {

  def apply(
    s3ExportRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    backup: Option[software.amazon.awscdk.services.rds.BackupProps] = None,
    instances: Option[Number] = None,
    preferredMaintenanceWindow: Option[String] = None,
    s3ImportRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    monitoringRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    parameterGroup: Option[software.amazon.awscdk.services.rds.IParameterGroup] = None,
    cloudwatchLogsExports: Option[List[String]] = None,
    deletionProtection: Option[Boolean] = None,
    port: Option[Number] = None,
    instanceProps: Option[software.amazon.awscdk.services.rds.InstanceProps] = None,
    cloudwatchLogsRetentionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    s3ExportBuckets: Option[List[_ <: software.amazon.awscdk.services.s3.IBucket]] = None,
    monitoringInterval: Option[software.amazon.awscdk.Duration] = None,
    snapshotIdentifier: Option[String] = None,
    subnetGroup: Option[software.amazon.awscdk.services.rds.ISubnetGroup] = None,
    iamAuthentication: Option[Boolean] = None,
    s3ImportBuckets: Option[List[_ <: software.amazon.awscdk.services.s3.IBucket]] = None,
    defaultDatabaseName: Option[String] = None,
    clusterIdentifier: Option[String] = None,
    instanceIdentifierBase: Option[String] = None,
    cloudwatchLogsRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    engine: Option[software.amazon.awscdk.services.rds.IClusterEngine] = None
  ): software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps =
    (new software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshotProps.Builder)
      .s3ExportRole(s3ExportRole.orNull)
      .backup(backup.orNull)
      .instances(instances.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .s3ImportRole(s3ImportRole.orNull)
      .monitoringRole(monitoringRole.orNull)
      .parameterGroup(parameterGroup.orNull)
      .cloudwatchLogsExports(cloudwatchLogsExports.map(_.asJava).orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .port(port.orNull)
      .instanceProps(instanceProps.orNull)
      .cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole.orNull)
      .s3ExportBuckets(s3ExportBuckets.map(_.asJava).orNull)
      .monitoringInterval(monitoringInterval.orNull)
      .snapshotIdentifier(snapshotIdentifier.orNull)
      .subnetGroup(subnetGroup.orNull)
      .iamAuthentication(iamAuthentication.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3ImportBuckets(s3ImportBuckets.map(_.asJava).orNull)
      .defaultDatabaseName(defaultDatabaseName.orNull)
      .clusterIdentifier(clusterIdentifier.orNull)
      .instanceIdentifierBase(instanceIdentifierBase.orNull)
      .cloudwatchLogsRetention(cloudwatchLogsRetention.orNull)
      .removalPolicy(removalPolicy.orNull)
      .engine(engine.orNull)
      .build()
}
