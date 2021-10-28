package io.burkard.cdk.services.efs

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAccessPointProps {

  def apply(
    clientToken: Option[String] = None,
    accessPointTags: Option[List[_]] = None,
    rootDirectory: Option[software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty] = None,
    fileSystemId: Option[String] = None,
    posixUser: Option[software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty] = None
  ): software.amazon.awscdk.services.efs.CfnAccessPointProps =
    (new software.amazon.awscdk.services.efs.CfnAccessPointProps.Builder)
      .clientToken(clientToken.orNull)
      .accessPointTags(accessPointTags.map(_.asJava).orNull)
      .rootDirectory(rootDirectory.orNull)
      .fileSystemId(fileSystemId.orNull)
      .posixUser(posixUser.orNull)
      .build()
}
