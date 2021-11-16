package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CreationInfoProperty {

  def apply(
    permissions: String,
    ownerGid: String,
    ownerUid: String
  ): software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty =
    (new software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty.Builder)
      .permissions(permissions)
      .ownerGid(ownerGid)
      .ownerUid(ownerUid)
      .build()
}
