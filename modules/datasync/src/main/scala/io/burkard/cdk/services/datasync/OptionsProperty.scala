package io.burkard.cdk.services.datasync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OptionsProperty {

  def apply(
    bytesPerSecond: Option[Number] = None,
    mtime: Option[String] = None,
    taskQueueing: Option[String] = None,
    verifyMode: Option[String] = None,
    overwriteMode: Option[String] = None,
    atime: Option[String] = None,
    logLevel: Option[String] = None,
    posixPermissions: Option[String] = None,
    gid: Option[String] = None,
    preserveDevices: Option[String] = None,
    securityDescriptorCopyFlags: Option[String] = None,
    preserveDeletedFiles: Option[String] = None,
    uid: Option[String] = None,
    transferMode: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty =
    (new software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty.Builder)
      .bytesPerSecond(bytesPerSecond.orNull)
      .mtime(mtime.orNull)
      .taskQueueing(taskQueueing.orNull)
      .verifyMode(verifyMode.orNull)
      .overwriteMode(overwriteMode.orNull)
      .atime(atime.orNull)
      .logLevel(logLevel.orNull)
      .posixPermissions(posixPermissions.orNull)
      .gid(gid.orNull)
      .preserveDevices(preserveDevices.orNull)
      .securityDescriptorCopyFlags(securityDescriptorCopyFlags.orNull)
      .preserveDeletedFiles(preserveDeletedFiles.orNull)
      .uid(uid.orNull)
      .transferMode(transferMode.orNull)
      .build()
}
