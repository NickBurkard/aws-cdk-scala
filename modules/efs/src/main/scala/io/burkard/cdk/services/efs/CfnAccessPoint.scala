package io.burkard.cdk.services.efs

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPoint {

  def apply(
    internalResourceId: String,
    clientToken: Option[String] = None,
    accessPointTags: Option[List[_]] = None,
    rootDirectory: Option[software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty] = None,
    fileSystemId: Option[String] = None,
    posixUser: Option[software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.efs.CfnAccessPoint =
    software.amazon.awscdk.services.efs.CfnAccessPoint.Builder
      .create(stackCtx, internalResourceId)
      .clientToken(clientToken.orNull)
      .accessPointTags(accessPointTags.map(_.asJava).orNull)
      .rootDirectory(rootDirectory.orNull)
      .fileSystemId(fileSystemId.orNull)
      .posixUser(posixUser.orNull)
      .build()
}
