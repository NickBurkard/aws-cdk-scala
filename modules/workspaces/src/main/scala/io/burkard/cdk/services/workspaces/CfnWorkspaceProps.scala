package io.burkard.cdk.services.workspaces

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWorkspaceProps {

  def apply(
    bundleId: String,
    userName: String,
    directoryId: String,
    rootVolumeEncryptionEnabled: Option[Boolean] = None,
    workspaceProperties: Option[software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty] = None,
    volumeEncryptionKey: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    userVolumeEncryptionEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.workspaces.CfnWorkspaceProps =
    (new software.amazon.awscdk.services.workspaces.CfnWorkspaceProps.Builder)
      .bundleId(bundleId)
      .userName(userName)
      .directoryId(directoryId)
      .rootVolumeEncryptionEnabled(rootVolumeEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .workspaceProperties(workspaceProperties.orNull)
      .volumeEncryptionKey(volumeEncryptionKey.orNull)
      .tags(tags.map(_.asJava).orNull)
      .userVolumeEncryptionEnabled(userVolumeEncryptionEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
