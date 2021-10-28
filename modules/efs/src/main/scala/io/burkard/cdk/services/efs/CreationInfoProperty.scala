package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CreationInfoProperty {

  def apply(
    permissions: Option[String] = None,
    ownerGid: Option[String] = None,
    ownerUid: Option[String] = None
  ): software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty =
    (new software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty.Builder)
      .permissions(permissions.orNull)
      .ownerGid(ownerGid.orNull)
      .ownerUid(ownerUid.orNull)
      .build()
}
