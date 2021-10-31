package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnUser {

  def apply(
    internalResourceId: String,
    path: Option[String] = None,
    policies: Option[List[_]] = None,
    permissionsBoundary: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    groups: Option[List[String]] = None,
    loginProfile: Option[software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty] = None,
    managedPolicyArns: Option[List[String]] = None,
    userName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iam.CfnUser =
    software.amazon.awscdk.services.iam.CfnUser.Builder
      .create(stackCtx, internalResourceId)
      .path(path.orNull)
      .policies(policies.map(_.asJava).orNull)
      .permissionsBoundary(permissionsBoundary.orNull)
      .tags(tags.map(_.asJava).orNull)
      .groups(groups.map(_.asJava).orNull)
      .loginProfile(loginProfile.orNull)
      .managedPolicyArns(managedPolicyArns.map(_.asJava).orNull)
      .userName(userName.orNull)
      .build()
}
