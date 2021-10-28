package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessPointOptions {

  def apply(
    createAcl: Option[software.amazon.awscdk.services.efs.Acl] = None,
    path: Option[String] = None,
    posixUser: Option[software.amazon.awscdk.services.efs.PosixUser] = None
  ): software.amazon.awscdk.services.efs.AccessPointOptions =
    (new software.amazon.awscdk.services.efs.AccessPointOptions.Builder)
      .createAcl(createAcl.orNull)
      .path(path.orNull)
      .posixUser(posixUser.orNull)
      .build()
}
