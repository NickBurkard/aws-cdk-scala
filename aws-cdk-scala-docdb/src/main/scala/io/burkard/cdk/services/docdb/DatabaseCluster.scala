package io.burkard.cdk.services.docdb

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseCluster {

  def apply(
    internalResourceId: String,
    backup: Option[software.amazon.awscdk.services.docdb.BackupProps] = None,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    storageEncrypted: Option[Boolean] = None,
    instances: Option[Number] = None,
    dbClusterName: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    deletionProtection: Option[Boolean] = None,
    port: Option[Number] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    instanceIdentifierBase: Option[String] = None,
    masterUser: Option[software.amazon.awscdk.services.docdb.Login] = None,
    engineVersion: Option[String] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    securityGroup: Option[software.amazon.awscdk.services.ec2.ISecurityGroup] = None,
    parameterGroup: Option[software.amazon.awscdk.services.docdb.IClusterParameterGroup] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.docdb.DatabaseCluster =
    software.amazon.awscdk.services.docdb.DatabaseCluster.Builder
      .create(stackCtx, internalResourceId)
      .backup(backup.orNull)
      .kmsKey(kmsKey.orNull)
      .storageEncrypted(storageEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .instances(instances.orNull)
      .dbClusterName(dbClusterName.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .instanceType(instanceType.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .port(port.orNull)
      .vpc(vpc.orNull)
      .instanceIdentifierBase(instanceIdentifierBase.orNull)
      .masterUser(masterUser.orNull)
      .engineVersion(engineVersion.orNull)
      .removalPolicy(removalPolicy.orNull)
      .securityGroup(securityGroup.orNull)
      .parameterGroup(parameterGroup.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .build()
}
