package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Acl {

  def apply(
    permissions: String,
    ownerGid: String,
    ownerUid: String
  ): software.amazon.awscdk.services.efs.Acl =
    (new software.amazon.awscdk.services.efs.Acl.Builder)
      .permissions(permissions)
      .ownerGid(ownerGid)
      .ownerUid(ownerUid)
      .build()
}
