package io.burkard.cdk.services.fsx

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFileSystemProps {

  def apply(
    subnetIds: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    storageType: Option[String] = None,
    lustreConfiguration: Option[software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty] = None,
    windowsConfiguration: Option[software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty] = None,
    fileSystemType: Option[String] = None,
    storageCapacity: Option[Number] = None,
    kmsKeyId: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    backupId: Option[String] = None
  ): software.amazon.awscdk.services.fsx.CfnFileSystemProps =
    (new software.amazon.awscdk.services.fsx.CfnFileSystemProps.Builder)
      .subnetIds(subnetIds.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .storageType(storageType.orNull)
      .lustreConfiguration(lustreConfiguration.orNull)
      .windowsConfiguration(windowsConfiguration.orNull)
      .fileSystemType(fileSystemType.orNull)
      .storageCapacity(storageCapacity.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .backupId(backupId.orNull)
      .build()
}
