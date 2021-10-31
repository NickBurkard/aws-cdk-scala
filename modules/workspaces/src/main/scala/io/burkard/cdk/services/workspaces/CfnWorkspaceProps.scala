package io.burkard.cdk.services.workspaces

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnWorkspaceProps {

  def apply(
    bundleId: Option[String] = None,
    rootVolumeEncryptionEnabled: Option[Boolean] = None,
    workspaceProperties: Option[software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty] = None,
    userName: Option[String] = None,
    volumeEncryptionKey: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    directoryId: Option[String] = None,
    userVolumeEncryptionEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.workspaces.CfnWorkspaceProps =
    (new software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder)
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
