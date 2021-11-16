package io.burkard.cdk.services.connect

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUser {

  def apply(
    internalResourceId: String,
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
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.connect.CfnUser =
    software.amazon.awscdk.services.connect.CfnUser.Builder
      .create(stackCtx, internalResourceId)
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
