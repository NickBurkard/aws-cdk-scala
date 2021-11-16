package io.burkard.cdk.services.fsx

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFileSystem {

  def apply(
    internalResourceId: String,
    subnetIds: List[String],
    fileSystemType: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    storageType: Option[String] = None,
    lustreConfiguration: Option[software.amazon.awscdk.services.fsx.CfnFileSystem.LustreConfigurationProperty] = None,
    windowsConfiguration: Option[software.amazon.awscdk.services.fsx.CfnFileSystem.WindowsConfigurationProperty] = None,
    storageCapacity: Option[Number] = None,
    kmsKeyId: Option[String] = None,
    securityGroupIds: Option[List[String]] = None,
    backupId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.fsx.CfnFileSystem =
    software.amazon.awscdk.services.fsx.CfnFileSystem.Builder
      .create(stackCtx, internalResourceId)
      .subnetIds(subnetIds.asJava)
      .fileSystemType(fileSystemType)
      .tags(tags.map(_.asJava).orNull)
      .storageType(storageType.orNull)
      .lustreConfiguration(lustreConfiguration.orNull)
      .windowsConfiguration(windowsConfiguration.orNull)
      .storageCapacity(storageCapacity.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .backupId(backupId.orNull)
      .build()
}
