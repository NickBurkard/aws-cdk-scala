package io.burkard.cdk.services.lightsail

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AddOnProperty {

  def apply(
    autoSnapshotAddOnRequest: Option[software.amazon.awscdk.services.lightsail.CfnDisk.AutoSnapshotAddOnProperty] = None,
    status: Option[String] = None,
    addOnType: Option[String] = None
  ): software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty =
    (new software.amazon.awscdk.services.lightsail.CfnDisk.AddOnProperty.Builder)
      .autoSnapshotAddOnRequest(autoSnapshotAddOnRequest.orNull)
      .status(status.orNull)
      .addOnType(addOnType.orNull)
      .build()
}
