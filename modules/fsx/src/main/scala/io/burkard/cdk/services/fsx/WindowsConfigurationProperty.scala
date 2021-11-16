package io.burkard.cdk.services.fsx

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WindowsConfigurationProperty {

  def apply(
    throughputCapacity: Number,
    aliases: Option[List[String]] = None,
    dailyAutomaticBackupStartTime: Option[String] = None,
    deploymentType: Option[String] = None,
    weeklyMaintenanceStartTime: Option[String] = None,
    activeDirectoryId: Option[String] = None,
    copyTagsToBackups: Option[Boolean] = None,
    automaticBackupRetentionDays: Option[Number] = None,
    selfManagedActiveDirectoryConfiguration: Option[software.amazon.awscdk.services.fsx.CfnFileSystem.SelfManagedActiveDirectoryConfigurationProperty] = None,
    auditLogConfiguration: Option[software.amazon.awscdk.services.fsx.CfnFileSystem.AuditLogConfigurationProperty] = None,
    preferredSubnetId: Option[String] = None
  ): software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty =
    (new software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty.Builder)
      .throughputCapacity(throughputCapacity)
      .aliases(aliases.map(_.asJava).orNull)
      .dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime.orNull)
      .deploymentType(deploymentType.orNull)
      .weeklyMaintenanceStartTime(weeklyMaintenanceStartTime.orNull)
      .activeDirectoryId(activeDirectoryId.orNull)
      .copyTagsToBackups(copyTagsToBackups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .automaticBackupRetentionDays(automaticBackupRetentionDays.orNull)
      .selfManagedActiveDirectoryConfiguration(selfManagedActiveDirectoryConfiguration.orNull)
      .auditLogConfiguration(auditLogConfiguration.orNull)
      .preferredSubnetId(preferredSubnetId.orNull)
      .build()
}
