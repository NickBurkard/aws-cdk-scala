package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseClusterFromSnapshot {

  def apply(
    internalResourceId: String,
    instanceProps: software.amazon.awscdk.services.rds.InstanceProps,
    snapshotIdentifier: String,
    engine: software.amazon.awscdk.services.rds.IClusterEngine,
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
    cloudwatchLogsRetentionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    monitoringInterval: Option[software.amazon.awscdk.Duration] = None,
    subnetGroup: Option[software.amazon.awscdk.services.rds.ISubnetGroup] = None,
    iamAuthentication: Option[Boolean] = None,
    s3ImportBuckets: Option[List[_ <: software.amazon.awscdk.services.s3.IBucket]] = None,
    defaultDatabaseName: Option[String] = None,
    clusterIdentifier: Option[String] = None,
    instanceIdentifierBase: Option[String] = None,
    cloudwatchLogsRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    backtrackWindow: Option[software.amazon.awscdk.Duration] = None,
    s3ExportBuckets: Option[List[_ <: software.amazon.awscdk.services.s3.IBucket]] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot =
    software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot.Builder
      .create(stackCtx, internalResourceId)
      .instanceProps(instanceProps)
      .snapshotIdentifier(snapshotIdentifier)
      .engine(engine)
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
      .cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole.orNull)
      .monitoringInterval(monitoringInterval.orNull)
      .subnetGroup(subnetGroup.orNull)
      .iamAuthentication(iamAuthentication.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3ImportBuckets(s3ImportBuckets.map(_.asJava).orNull)
      .defaultDatabaseName(defaultDatabaseName.orNull)
      .clusterIdentifier(clusterIdentifier.orNull)
      .instanceIdentifierBase(instanceIdentifierBase.orNull)
      .cloudwatchLogsRetention(cloudwatchLogsRetention.orNull)
      .backtrackWindow(backtrackWindow.orNull)
      .s3ExportBuckets(s3ExportBuckets.map(_.asJava).orNull)
      .removalPolicy(removalPolicy.orNull)
      .build()
}
