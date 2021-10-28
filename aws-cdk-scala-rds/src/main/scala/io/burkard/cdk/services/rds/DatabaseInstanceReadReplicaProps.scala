package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DatabaseInstanceReadReplicaProps {

  def apply(
    s3ExportRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    subnetGroup: Option[software.amazon.awscdk.services.rds.ISubnetGroup] = None,
    backupRetention: Option[software.amazon.awscdk.Duration] = None,
    domain: Option[String] = None,
    instanceIdentifier: Option[String] = None,
    availabilityZone: Option[String] = None,
    storageType: Option[software.amazon.awscdk.services.rds.StorageType] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    cloudwatchLogsExports: Option[List[String]] = None,
    port: Option[Number] = None,
    iops: Option[Number] = None,
    optionGroup: Option[software.amazon.awscdk.services.rds.IOptionGroup] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    preferredBackupWindow: Option[String] = None,
    s3ExportBuckets: Option[List[_ <: software.amazon.awscdk.services.s3.IBucket]] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    iamAuthentication: Option[Boolean] = None,
    s3ImportBuckets: Option[List[_ <: software.amazon.awscdk.services.s3.IBucket]] = None,
    performanceInsightEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    storageEncrypted: Option[Boolean] = None,
    multiAz: Option[Boolean] = None,
    preferredMaintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None,
    processorFeatures: Option[software.amazon.awscdk.services.rds.ProcessorFeatures] = None,
    s3ImportRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    maxAllocatedStorage: Option[Number] = None,
    monitoringRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    deletionProtection: Option[Boolean] = None,
    copyTagsToSnapshot: Option[Boolean] = None,
    deleteAutomatedBackups: Option[Boolean] = None,
    performanceInsightRetention: Option[software.amazon.awscdk.services.rds.PerformanceInsightRetention] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    sourceDatabaseInstance: Option[software.amazon.awscdk.services.rds.IDatabaseInstance] = None,
    domainRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    storageEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    cloudwatchLogsRetentionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    publiclyAccessible: Option[Boolean] = None,
    cloudwatchLogsRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    monitoringInterval: Option[software.amazon.awscdk.Duration] = None,
    enablePerformanceInsights: Option[Boolean] = None
  ): software.amazon.awscdk.services.rds.DatabaseInstanceReadReplicaProps =
    (new software.amazon.awscdk.services.rds.DatabaseInstanceReadReplicaProps.Builder)
      .s3ExportRole(s3ExportRole.orNull)
      .subnetGroup(subnetGroup.orNull)
      .backupRetention(backupRetention.orNull)
      .domain(domain.orNull)
      .instanceIdentifier(instanceIdentifier.orNull)
      .availabilityZone(availabilityZone.orNull)
      .storageType(storageType.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .cloudwatchLogsExports(cloudwatchLogsExports.map(_.asJava).orNull)
      .port(port.orNull)
      .iops(iops.orNull)
      .optionGroup(optionGroup.orNull)
      .vpc(vpc.orNull)
      .preferredBackupWindow(preferredBackupWindow.orNull)
      .s3ExportBuckets(s3ExportBuckets.map(_.asJava).orNull)
      .removalPolicy(removalPolicy.orNull)
      .iamAuthentication(iamAuthentication.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3ImportBuckets(s3ImportBuckets.map(_.asJava).orNull)
      .performanceInsightEncryptionKey(performanceInsightEncryptionKey.orNull)
      .storageEncrypted(storageEncrypted.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .multiAz(multiAz.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .processorFeatures(processorFeatures.orNull)
      .s3ImportRole(s3ImportRole.orNull)
      .instanceType(instanceType.orNull)
      .maxAllocatedStorage(maxAllocatedStorage.orNull)
      .monitoringRole(monitoringRole.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .copyTagsToSnapshot(copyTagsToSnapshot.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deleteAutomatedBackups(deleteAutomatedBackups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .performanceInsightRetention(performanceInsightRetention.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .sourceDatabaseInstance(sourceDatabaseInstance.orNull)
      .domainRole(domainRole.orNull)
      .storageEncryptionKey(storageEncryptionKey.orNull)
      .cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole.orNull)
      .publiclyAccessible(publiclyAccessible.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudwatchLogsRetention(cloudwatchLogsRetention.orNull)
      .monitoringInterval(monitoringInterval.orNull)
      .enablePerformanceInsights(enablePerformanceInsights.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
