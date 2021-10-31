package io.burkard.cdk.services.fsx

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LustreConfiguration {

  def apply(
    deploymentType: Option[software.amazon.awscdk.services.fsx.LustreDeploymentType] = None,
    weeklyMaintenanceStartTime: Option[software.amazon.awscdk.services.fsx.LustreMaintenanceTime] = None,
    importPath: Option[String] = None,
    exportPath: Option[String] = None,
    perUnitStorageThroughput: Option[Number] = None,
    importedFileChunkSizeMiB: Option[Number] = None
  ): software.amazon.awscdk.services.fsx.LustreConfiguration =
    (new software.amazon.awscdk.services.fsx.LustreConfiguration.Builder)
      .deploymentType(deploymentType.orNull)
      .weeklyMaintenanceStartTime(weeklyMaintenanceStartTime.orNull)
      .importPath(importPath.orNull)
      .exportPath(exportPath.orNull)
      .perUnitStorageThroughput(perUnitStorageThroughput.orNull)
      .importedFileChunkSizeMiB(importedFileChunkSizeMiB.orNull)
      .build()
}
