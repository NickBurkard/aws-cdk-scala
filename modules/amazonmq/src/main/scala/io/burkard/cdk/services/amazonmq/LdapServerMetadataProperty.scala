package io.burkard.cdk.services.amazonmq

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LdapServerMetadataProperty {

  def apply(
    hosts: List[String],
    serviceAccountPassword: String,
    serviceAccountUsername: String,
    userBase: String,
    userSearchMatching: String,
    roleSearchMatching: String,
    roleBase: String,
    roleSearchSubtree: Option[Boolean] = None,
    roleName: Option[String] = None,
    userSearchSubtree: Option[Boolean] = None,
    userRoleName: Option[String] = None
  ): software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty =
    (new software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty.Builder)
      .hosts(hosts.asJava)
      .serviceAccountPassword(serviceAccountPassword)
      .serviceAccountUsername(serviceAccountUsername)
      .userBase(userBase)
      .userSearchMatching(userSearchMatching)
      .roleSearchMatching(roleSearchMatching)
      .roleBase(roleBase)
      .roleSearchSubtree(roleSearchSubtree.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .roleName(roleName.orNull)
      .userSearchSubtree(userSearchSubtree.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .userRoleName(userRoleName.orNull)
      .build()
}
