package io.burkard.cdk.services.workspaces

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnWorkspace {

  def apply(
    internalResourceId: String,
    bundleId: String,
    userName: String,
    directoryId: String,
    rootVolumeEncryptionEnabled: Option[Boolean] = None,
    workspaceProperties: Option[software.amazon.awscdk.services.workspaces.CfnWorkspace.WorkspacePropertiesProperty] = None,
    volumeEncryptionKey: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    userVolumeEncryptionEnabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.workspaces.CfnWorkspace =
    software.amazon.awscdk.services.workspaces.CfnWorkspace.Builder
      .create(stackCtx, internalResourceId)
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
