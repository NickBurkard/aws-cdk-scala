package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessPoint {

  def apply(
    internalResourceId: String,
    fileSystem: software.amazon.awscdk.services.efs.IFileSystem,
    createAcl: Option[software.amazon.awscdk.services.efs.Acl] = None,
    path: Option[String] = None,
    posixUser: Option[software.amazon.awscdk.services.efs.PosixUser] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.efs.AccessPoint =
    software.amazon.awscdk.services.efs.AccessPoint.Builder
      .create(stackCtx, internalResourceId)
      .fileSystem(fileSystem)
      .createAcl(createAcl.orNull)
      .path(path.orNull)
      .posixUser(posixUser.orNull)
      .build()
}
