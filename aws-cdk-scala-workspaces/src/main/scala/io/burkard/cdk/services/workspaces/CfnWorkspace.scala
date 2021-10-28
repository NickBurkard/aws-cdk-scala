package io.burkard.cdk.services.workspaces

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWorkspace {

  def apply(
    internalResourceId: String,
    bundleId: Option[String] = None,
    rootVolumeEncryptionEnabled: Option[Boolean] = None,
    workspaceProperties: Option[software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty] = None,
    userName: Option[String] = None,
    volumeEncryptionKey: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    directoryId: Option[String] = None,
    userVolumeEncryptionEnabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.workspaces.CfnWorkspace =
    software.amazon.awscdk.services.workspaces.CfnWorkspace.Builder
      .create(stackCtx, internalResourceId)
      .bundleId(bundleId.orNull)
      .rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .workspaceProperties(workspaceProperties.orNull)
      .userName(userName.orNull)
      .volumeEncryptionKey(volumeEncryptionKey.orNull)
      .tags(tags.map(_.asJava).orNull)
      .directoryId(directoryId.orNull)
      .userVolumeEncryptionEnabled(userVolumeEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
