package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LustreConfigurationProperty {

  def apply(
    perUnitStorageThroughput: Option[Number] = None,
    dataCompressionType: Option[String] = None,
    dailyAutomaticBackupStartTime: Option[String] = None,
    deploymentType: Option[String] = None,
    weeklyMaintenanceStartTime: Option[String] = None,
    importedFileChunkSize: Option[Number] = None,
    importPath: Option[String] = None,
    driveCacheType: Option[String] = None,
    copyTagsToBackups: Option[Boolean] = None,
    automaticBackupRetentionDays: Option[Number] = None,
    autoImportPolicy: Option[String] = None,
    exportPath: Option[String] = None
  ): software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty =
    (new software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty.Builder)
      .perUnitStorageThroughput(perUnitStorageThroughput.orNull)
      .dataCompressionType(dataCompressionType.orNull)
      .dailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime.orNull)
      .deploymentType(deploymentType.orNull)
      .weeklyMaintenanceStartTime(weeklyMaintenanceStartTime.orNull)
      .importedFileChunkSize(importedFileChunkSize.orNull)
      .importPath(importPath.orNull)
      .driveCacheType(driveCacheType.orNull)
      .copyTagsToBackups(copyTagsToBackups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .automaticBackupRetentionDays(automaticBackupRetentionDays.orNull)
      .autoImportPolicy(autoImportPolicy.orNull)
      .exportPath(exportPath.orNull)
      .build()
}
