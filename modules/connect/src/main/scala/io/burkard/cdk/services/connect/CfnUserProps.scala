package io.burkard.cdk.services.connect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserProps {

  def apply(
    username: String,
    phoneConfig: software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty,
    routingProfileArn: String,
    securityProfileArns: List[String],
    instanceArn: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    directoryUserId: Option[String] = None,
    hierarchyGroupArn: Option[String] = None,
    identityInfo: Option[software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty] = None,
    password: Option[String] = None
  ): software.amazon.awscdk.services.connect.CfnUserProps =
    (new software.amazon.awscdk.services.connect.CfnUserProps.Builder)
      .username(username)
      .phoneConfig(phoneConfig)
      .routingProfileArn(routingProfileArn)
      .securityProfileArns(securityProfileArns.asJava)
      .instanceArn(instanceArn)
      .tags(tags.map(_.asJava).orNull)
      .directoryUserId(directoryUserId.orNull)
      .hierarchyGroupArn(hierarchyGroupArn.orNull)
      .identityInfo(identityInfo.orNull)
      .password(password.orNull)
      .build()
}
