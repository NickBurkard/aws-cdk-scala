package io.burkard.cdk.services.fsx

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OntapConfigurationProperty {

  def apply(
    deploymentType: String,
    endpointIpAddressRange: Option[String] = None,
    weeklyMaintenanceStartTime: Option[String] = None,
    routeTableIds: Option[List[String]] = None,
    throughputCapacity: Option[Number] = None,
    automaticBackupRetentionDays: Option[Number] = None,
    dailyAutomaticBackupStartTime: Option[String] = None,
    fsxAdminPassword: Option[String] = None,
    diskIopsConfiguration: Option[software.amazon.awscdk.services.fsx.CfnFileSystem.DiskIopsConfigurationProperty] = None,
    preferredSubnetId: Option[String] = None
  ): software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty =
    (new software.amazon.awscdk.services.fsx.CfnFileSystem.OntapConfigurationProperty.Builder)
      .deploymentType(deploymentType)
      .endpointIpAddressRange(endpointIpAddressRange.orNull)
      .weeklyMaintenanceStartTime(weeklyMaintenanceStartTime.orNull)
      .routeTableIds(routeTableIds.map(_.asJava).orNull)
      .throughputCapacity(throughputCapacity.orNull)
      .automaticBackupRetentionDays(automaticBackupRetentionDays.orNull)
      .dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime.orNull)
      .fsxAdminPassword(fsxAdminPassword.orNull)
      .diskIopsConfiguration(diskIopsConfiguration.orNull)
      .preferredSubnetId(preferredSubnetId.orNull)
      .build()
}
