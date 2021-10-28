package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessPoint {

  def apply(
    internalResourceId: String,
    createAcl: Option[software.amazon.awscdk.services.efs.Acl] = None,
    path: Option[String] = None,
    fileSystem: Option[software.amazon.awscdk.services.efs.IFileSystem] = None,
    posixUser: Option[software.amazon.awscdk.services.efs.PosixUser] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.efs.AccessPoint =
    software.amazon.awscdk.services.efs.AccessPoint.Builder
      .create(stackCtx, internalResourceId)
      .createAcl(createAcl.orNull)
      .path(path.orNull)
      .fileSystem(fileSystem.orNull)
      .posixUser(posixUser.orNull)
      .build()
}
