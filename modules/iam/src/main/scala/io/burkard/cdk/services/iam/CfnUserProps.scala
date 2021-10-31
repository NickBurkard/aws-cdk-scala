package io.burkard.cdk.services.iam

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnUserProps {

  def apply(
    path: Option[String] = None,
    policies: Option[List[_]] = None,
    permissionsBoundary: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    groups: Option[List[String]] = None,
    loginProfile: Option[software.amazon.awscdk.services.iam.CfnUser.LoginProfileProperty] = None,
    managedPolicyArns: Option[List[String]] = None,
    userName: Option[String] = None
  ): software.amazon.awscdk.services.iam.CfnUserProps =
    (new software.amazon.awscdk.services.iam.CfnUserProps.Builder)
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
