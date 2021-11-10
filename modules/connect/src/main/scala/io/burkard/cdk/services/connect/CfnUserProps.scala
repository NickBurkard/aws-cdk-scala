package io.burkard.cdk.services.connect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserProps {

  def apply(
    username: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    phoneConfig: Option[software.amazon.awscdk.services.connect.CfnUser.UserPhoneConfigProperty] = None,
    directoryUserId: Option[String] = None,
    hierarchyGroupArn: Option[String] = None,
    routingProfileArn: Option[String] = None,
    securityProfileArns: Option[List[String]] = None,
    identityInfo: Option[software.amazon.awscdk.services.connect.CfnUser.UserIdentityInfoProperty] = None,
    instanceArn: Option[String] = None,
    password: Option[String] = None
  ): software.amazon.awscdk.services.connect.CfnUserProps =
    (new software.amazon.awscdk.services.connect.CfnUserProps.Builder)
      .username(username.orNull)
      .tags(tags.map(_.asJava).orNull)
      .phoneConfig(phoneConfig.orNull)
      .directoryUserId(directoryUserId.orNull)
      .hierarchyGroupArn(hierarchyGroupArn.orNull)
      .routingProfileArn(routingProfileArn.orNull)
      .securityProfileArns(securityProfileArns.map(_.asJava).orNull)
      .identityInfo(identityInfo.orNull)
      .instanceArn(instanceArn.orNull)
      .password(password.orNull)
      .build()
}
