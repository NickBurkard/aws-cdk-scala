package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DatabaseInstanceFromSnapshot {

  def apply(
    internalResourceId: String,
    snapshotIdentifier: String,
    s3ExportRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    backupRetention: Option[software.amazon.awscdk.Duration] = None,
    vpcPlacement: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    instanceIdentifier: Option[String] = None,
    availabilityZone: Option[String] = None,
    storageType: Option[software.amazon.awscdk.services.rds.StorageType] = None,
    cloudwatchLogsExports: Option[List[String]] = None,
    iops: Option[Number] = None,
    optionGroup: Option[software.amazon.awscdk.services.rds.IOptionGroup] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    cloudwatchLogsRetentionRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    databaseName: Option[String] = None,
    preferredBackupWindow: Option[String] = None,
    s3ExportBuckets: Option[List[_ <: software.amazon.awscdk.services.s3.IBucket]] = None,
    subnetGroup: Option[software.amazon.awscdk.services.rds.ISubnetGroup] = None,
    iamAuthentication: Option[Boolean] = None,
    s3ImportBuckets: Option[List[_ <: software.amazon.awscdk.services.s3.IBucket]] = None,
    performanceInsightEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    multiAz: Option[Boolean] = None,
    domain: Option[String] = None,
    timezone: Option[String] = None,
    preferredMaintenanceWindow: Option[String] = None,
    autoMinorVersionUpgrade: Option[Boolean] = None,
    processorFeatures: Option[software.amazon.awscdk.services.rds.ProcessorFeatures] = None,
    s3ImportRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    maxAllocatedStorage: Option[Number] = None,
    monitoringRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    parameterGroup: Option[software.amazon.awscdk.services.rds.IParameterGroup] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    deletionProtection: Option[Boolean] = None,
    copyTagsToSnapshot: Option[Boolean] = None,
    allocatedStorage: Option[Number] = None,
    allowMajorVersionUpgrade: Option[Boolean] = None,
    port: Option[Number] = None,
    deleteAutomatedBackups: Option[Boolean] = None,
    performanceInsightRetention: Option[software.amazon.awscdk.services.rds.PerformanceInsightRetention] = None,
    securityGroups: Option[List[_ <: software.amazon.awscdk.services.ec2.ISecurityGroup]] = None,
    domainRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    licenseModel: Option[software.amazon.awscdk.services.rds.LicenseModel] = None,
    publiclyAccessible: Option[Boolean] = None,
    cloudwatchLogsRetention: Option[software.amazon.awscdk.services.logs.RetentionDays] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    credentials: Option[software.amazon.awscdk.services.rds.SnapshotCredentials] = None,
    engine: Option[software.amazon.awscdk.services.rds.IInstanceEngine] = None,
    monitoringInterval: Option[software.amazon.awscdk.Duration] = None,
    enablePerformanceInsights: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshot =
    software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshot.Builder
      .create(stackCtx, internalResourceId)
      .snapshotIdentifier(snapshotIdentifier)
      .s3ExportRole(s3ExportRole.orNull)
      .backupRetention(backupRetention.orNull)
      .vpcPlacement(vpcPlacement.orNull)
      .instanceIdentifier(instanceIdentifier.orNull)
      .availabilityZone(availabilityZone.orNull)
      .storageType(storageType.orNull)
      .cloudwatchLogsExports(cloudwatchLogsExports.map(_.asJava).orNull)
      .iops(iops.orNull)
      .optionGroup(optionGroup.orNull)
      .vpc(vpc.orNull)
      .cloudwatchLogsRetentionRole(cloudwatchLogsRetentionRole.orNull)
      .databaseName(databaseName.orNull)
      .preferredBackupWindow(preferredBackupWindow.orNull)
      .s3ExportBuckets(s3ExportBuckets.map(_.asJava).orNull)
      .subnetGroup(subnetGroup.orNull)
      .iamAuthentication(iamAuthentication.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3ImportBuckets(s3ImportBuckets.map(_.asJava).orNull)
      .performanceInsightEncryptionKey(performanceInsightEncryptionKey.orNull)
      .multiAz(multiAz.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .domain(domain.orNull)
      .timezone(timezone.orNull)
      .preferredMaintenanceWindow(preferredMaintenanceWindow.orNull)
      .autoMinorVersionUpgrade(autoMinorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .processorFeatures(processorFeatures.orNull)
      .s3ImportRole(s3ImportRole.orNull)
      .instanceType(instanceType.orNull)
      .maxAllocatedStorage(maxAllocatedStorage.orNull)
      .monitoringRole(monitoringRole.orNull)
      .parameterGroup(parameterGroup.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .deletionProtection(deletionProtection.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .copyTagsToSnapshot(copyTagsToSnapshot.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .allocatedStorage(allocatedStorage.orNull)
      .allowMajorVersionUpgrade(allowMajorVersionUpgrade.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .port(port.orNull)
      .deleteAutomatedBackups(deleteAutomatedBackups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .performanceInsightRetention(performanceInsightRetention.orNull)
      .securityGroups(securityGroups.map(_.asJava).orNull)
      .domainRole(domainRole.orNull)
      .licenseModel(licenseModel.orNull)
      .publiclyAccessible(publiclyAccessible.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloudwatchLogsRetention(cloudwatchLogsRetention.orNull)
      .removalPolicy(removalPolicy.orNull)
      .credentials(credentials.orNull)
      .engine(engine.orNull)
      .monitoringInterval(monitoringInterval.orNull)
      .enablePerformanceInsights(enablePerformanceInsights.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
