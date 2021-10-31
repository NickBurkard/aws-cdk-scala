package io.burkard.cdk.services.transfer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUserProps {

  def apply(
    role: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    posixProfile: Option[software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty] = None,
    serverId: Option[String] = None,
    homeDirectory: Option[String] = None,
    homeDirectoryMappings: Option[List[_]] = None,
    sshPublicKeys: Option[List[String]] = None,
    policy: Option[String] = None,
    userName: Option[String] = None,
    homeDirectoryType: Option[String] = None
  ): software.amazon.awscdk.services.transfer.CfnUserProps =
    (new software.amazon.awscdk.services.transfer.CfnUserProps.Builder)
      .role(role.orNull)
      .tags(tags.map(_.asJava).orNull)
      .posixProfile(posixProfile.orNull)
      .serverId(serverId.orNull)
      .homeDirectory(homeDirectory.orNull)
      .homeDirectoryMappings(homeDirectoryMappings.map(_.asJava).orNull)
      .sshPublicKeys(sshPublicKeys.map(_.asJava).orNull)
      .policy(policy.orNull)
      .userName(userName.orNull)
      .homeDirectoryType(homeDirectoryType.orNull)
      .build()
}
