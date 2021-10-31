package io.burkard.cdk.services.amazonmq

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LdapServerMetadataProperty {

  def apply(
    roleSearchSubtree: Option[Boolean] = None,
    roleName: Option[String] = None,
    userSearchSubtree: Option[Boolean] = None,
    hosts: Option[List[String]] = None,
    serviceAccountPassword: Option[String] = None,
    userRoleName: Option[String] = None,
    serviceAccountUsername: Option[String] = None,
    userBase: Option[String] = None,
    userSearchMatching: Option[String] = None,
    roleSearchMatching: Option[String] = None,
    roleBase: Option[String] = None
  ): software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty =
    (new software.amazon.awscdk.services.amazonmq.CfnBroker.LdapServerMetadataProperty.Builder)
      .roleSearchSubtree(roleSearchSubtree.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .roleName(roleName.orNull)
      .userSearchSubtree(userSearchSubtree.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .hosts(hosts.map(_.asJava).orNull)
      .serviceAccountPassword(serviceAccountPassword.orNull)
      .userRoleName(userRoleName.orNull)
      .serviceAccountUsername(serviceAccountUsername.orNull)
      .userBase(userBase.orNull)
      .userSearchMatching(userSearchMatching.orNull)
      .roleSearchMatching(roleSearchMatching.orNull)
      .roleBase(roleBase.orNull)
      .build()
}
