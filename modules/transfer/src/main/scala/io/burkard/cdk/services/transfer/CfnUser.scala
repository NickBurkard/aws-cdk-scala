package io.burkard.cdk.services.transfer

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUser {

  def apply(
    internalResourceId: String,
    role: String,
    serverId: String,
    userName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    posixProfile: Option[software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty] = None,
    homeDirectory: Option[String] = None,
    homeDirectoryMappings: Option[List[_]] = None,
    sshPublicKeys: Option[List[String]] = None,
    policy: Option[String] = None,
    homeDirectoryType: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.transfer.CfnUser =
    software.amazon.awscdk.services.transfer.CfnUser.Builder
      .create(stackCtx, internalResourceId)
      .role(role)
      .serverId(serverId)
      .userName(userName)
      .tags(tags.map(_.asJava).orNull)
      .posixProfile(posixProfile.orNull)
      .homeDirectory(homeDirectory.orNull)
      .homeDirectoryMappings(homeDirectoryMappings.map(_.asJava).orNull)
      .sshPublicKeys(sshPublicKeys.map(_.asJava).orNull)
      .policy(policy.orNull)
      .homeDirectoryType(homeDirectoryType.orNull)
      .build()
}
