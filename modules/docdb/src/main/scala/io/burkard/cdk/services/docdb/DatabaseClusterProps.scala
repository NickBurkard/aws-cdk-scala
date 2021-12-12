package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseClusterProps {

  def apply(
    instanceType: software.amazon.awscdk.services.ec2.InstanceType,
    vpc: software.amazon.awscdk.services.ec2.IVpc,
    masterUser: software.amazon.awscdk.services.docdb.Login,
    backup: Option[software.amazon.awscdk.services.docdb.BackupProps] = None,
    storageEncrypted: Option[Boolean] = None,
    instances: Option[Number] = None,
    dbClusterName: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    deletionProtection: Option[Boolean] = None,
    port: Option[Number] = None,
    exportAuditLogsToCloudWatch: Option[Boolean] = None,
    instanceIdentifierBase: Option[String] = None,
    engineVersion: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    exportProfilerLogsToCloudWatch: Option[Boolean] = None,
    parameterGroup: Option[software.amazon.awscdk.services.docdb.IClusterParameterGroup] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None
  ): software.amazon.awscdk.services.docdb.DatabaseClusterProps =
    (new software.amazon.awscdk.services.docdb.DatabaseClusterProps.Builder)
      .instanceType(instanceType)
      .vpc(vpc)
      .masterUser(masterUser)
      .backup(backup.orNull)
      .storageEncrypted(storageEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instances(instances.orNull)
      .dbClusterName(dbClusterName.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .port(port.orNull)
      .exportAuditLogsToCloudWatch(exportAuditLogsToCloudWatch.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instanceIdentifierBase(instanceIdentifierBase.orNull)
      .engineVersion(engineVersion.orNull)
      .removalPolicy(removalPolicy.orNull)
      .securityGroup(securityGroup.orNull)
      .kmsKey(kmsKey.orNull)
      .exportProfilerLogsToCloudWatch(exportProfilerLogsToCloudWatch.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .parameterGroup(parameterGroup.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .build()
}
