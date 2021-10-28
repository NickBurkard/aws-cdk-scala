package io.burkard.cdk.services.nimblestudio

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SharedFileSystemConfigurationProperty {

  def apply(
    windowsMountDrive: Option[String] = None,
    endpoint: Option[String] = None,
    linuxMountPoint: Option[String] = None,
    shareName: Option[String] = None,
    fileSystemId: Option[String] = None
  ): software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty =
    (new software.amazon.awscdk.services.nimblestudio.CfnStudioComponent.SharedFileSystemConfigurationProperty.Builder)
      .windowsMountDrive(windowsMountDrive.orNull)
      .endpoint(endpoint.orNull)
      .linuxMountPoint(linuxMountPoint.orNull)
      .shareName(shareName.orNull)
      .fileSystemId(fileSystemId.orNull)
      .build()
}
