package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessPointProps {

  def apply(
    fileSystem: software.amazon.awscdk.services.efs.IFileSystem,
    createAcl: Option[software.amazon.awscdk.services.efs.Acl] = None,
    path: Option[String] = None,
    posixUser: Option[software.amazon.awscdk.services.efs.PosixUser] = None
  ): software.amazon.awscdk.services.efs.AccessPointProps =
    (new software.amazon.awscdk.services.efs.AccessPointProps.Builder)
      .fileSystem(fileSystem)
      .createAcl(createAcl.orNull)
      .path(path.orNull)
      .posixUser(posixUser.orNull)
      .build()
}
