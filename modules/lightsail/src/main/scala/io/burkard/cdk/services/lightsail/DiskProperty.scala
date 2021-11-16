package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DiskProperty {

  def apply(
    path: String,
    diskName: String,
    attachedTo: Option[String] = None,
    attachmentState: Option[String] = None,
    isSystemDisk: Option[Boolean] = None,
    iops: Option[Number] = None,
    sizeInGb: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty =
    (new software.amazon.awscdk.services.lightsail.CfnInstance.DiskProperty.Builder)
      .path(path)
      .diskName(diskName)
      .attachedTo(attachedTo.orNull)
      .attachmentState(attachmentState.orNull)
      .isSystemDisk(isSystemDisk.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .iops(iops.orNull)
      .sizeInGb(sizeInGb.orNull)
      .build()
}
