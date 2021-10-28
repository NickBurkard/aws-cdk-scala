package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DiskProperty {

  def apply(
    path: Option[String] = None,
    attachedTo: Option[String] = None,
    attachmentState: Option[String] = None,
    isSystemDisk: Option[Boolean] = None,
    iops: Option[Number] = None,
    sizeInGb: Option[String] = None,
    diskName: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty =
    (new software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty.Builder)
      .path(path.orNull)
      .attachedTo(attachedTo.orNull)
      .attachmentState(attachmentState.orNull)
      .isSystemDisk(isSystemDisk.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .iops(iops.orNull)
      .sizeInGb(sizeInGb.orNull)
      .diskName(diskName.orNull)
      .build()
}
