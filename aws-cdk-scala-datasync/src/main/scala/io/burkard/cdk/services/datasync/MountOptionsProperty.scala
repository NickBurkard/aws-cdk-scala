package io.burkard.cdk.services.datasync

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MountOptionsProperty {

  def apply(
    version: Option[String] = None
  ): software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty =
    (new software.amazon.awscdk.services.datasync.CfnLocationSMB.MountOptionsProperty.Builder)
      .version(version.orNull)
      .build()
}
